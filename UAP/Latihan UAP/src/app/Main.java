package app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import db.Connect;
import model.Aquarium;
import model.Fish;
import model.FreshWaterFish;
import model.SaltWaterFish;

public class Main {

	Connect db = new Connect();
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	ArrayList<Aquarium> aquariumList = new ArrayList();
	ArrayList<Fish> fishList = new ArrayList();

	void refreshFishListData() {
		// kosongin data
		ArrayList<Fish> temp = new ArrayList();
		// tarik data terbaru
		String query = "SELECT * FROM fishSpecies";
		ResultSet rs = db.executeQuery(query);
		try {
			while (rs.next()) {
				String fishSpeciesID = rs.getString("FishSpeciesId");
				String fishSpeciesName = rs.getString("FishSpeciesName");
				String fishSpeciesType = rs.getString("FishSpeciesType");
				Integer fishSpeciesAmount = rs.getInt("FishAmount");
				String fishAquariumID = rs.getString("AquariumId");

				if (fishSpeciesType.equals("Freshwater")) {
					FreshWaterFish f = new FreshWaterFish(fishSpeciesID, fishSpeciesName, fishSpeciesAmount,
							fishAquariumID);
					temp.add(f);

				} else if (fishSpeciesType.equals("Saltwater")) {
					SaltWaterFish s = new SaltWaterFish(fishAquariumID, fishSpeciesName, fishSpeciesAmount,
							fishAquariumID);
					temp.add(s);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// masukin ulang ke arrlist aquariumList
		fishList = temp;
	}

	void refreshAquariumListData() {
		// kosongin data
		ArrayList<Aquarium> temp = new ArrayList();
		// tarik data terbaru
		String query = "SELECT * FROM aquarium";
		ResultSet rs = db.executeQuery(query);
		try {
			while (rs.next()) {
				String aquariumID = rs.getString("AquariumId");
				String aquariumColor = rs.getString("AquariumColor");
				Integer aquariumCapacity = rs.getInt("AquariumCapacity");

				Aquarium a = new Aquarium(aquariumID, aquariumColor, aquariumCapacity);
				temp.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// masukin ulang ke arrlist aquariumList
		aquariumList = temp;

	}

	void cls() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}

	void printMainMenu() {
		cls();
		System.out.println("Menus");
		System.out.println("______________________________________");
		System.out.println("1. Insert New Fish Species");
		System.out.println("2. View Fish Species");
		System.out.println("3. Sell Fish");
		System.out.println("4. Add Aquarium");
		System.out.println("5. Show Aquariums");
		System.out.println("6. Exit");
		System.out.print(">> ");
	}

	String GenerateFishSpeciesID() {
		String id = "FI";
		Integer a = rand.nextInt(10);
		Integer b = rand.nextInt(10);
		Integer c = rand.nextInt(10);

		String finalID;
		finalID = id + a + b + c;

		return finalID;
	}

	String GenerateAquariumID() {
		String id = "AQ";
		Integer a = rand.nextInt(10);
		Integer b = rand.nextInt(10);
		Integer c = rand.nextInt(10);

		String finalID;
		finalID = id + a + b + c;

		return finalID;
	}

	Boolean checkFishSpeciesID(String fishSpeciesID) {
		refreshFishListData();
		for (Fish fish : fishList) {
			if (fishSpeciesID.equals(fish.getFishSpeciasID())) {
				return false;
			}
		}
		return true;
	}

	Boolean checkAquariumID(String aquariumID) {
		refreshAquariumListData();
		for (Aquarium aquarium : aquariumList) {
			if (aquarium.getAquariumID() == aquariumID) {
				return false;
			}
		}
		return true;
	}

	void addAquariumMenu() {
		cls();
		String aquariumColor;
		do {
			System.out.print("Aquarium Color [must be 'Green' or 'Red' or 'Blue' (case sensitive)]:");
			aquariumColor = sc.nextLine();
		} while (!(aquariumColor.equals("Red") || aquariumColor.equals("Green") || aquariumColor.equals("BLue")));

		Integer aquariumCapacity;
		do {
			System.out.print("Aquarium Capacity [must be between 100 - 500 (inclusive)]: ");
			aquariumCapacity = sc.nextInt();
			sc.nextLine();
		} while (!(aquariumCapacity >= 100 && aquariumCapacity <= 500));

		String genAqID;
		genAqID = GenerateAquariumID();

		while (checkAquariumID(genAqID).equals(false)) {
			genAqID = GenerateAquariumID();
		}

		String query = String.format("INSERT INTO aquarium VALUE('%s', '%s', '%d')", genAqID, aquariumColor,
				aquariumCapacity);
		db.executeUpdate(query);
		refreshAquariumListData();

	}

	void showAquariumsMenu() {
		cls();
		refreshAquariumListData();
		if (aquariumList.isEmpty()) {
			System.out.println("There is no aquarium");
		} else {
			// tampilin semua data aquarium
			for (Aquarium aquarium : aquariumList) {
				aquarium.showAquariumData();
			}
		}
	}

	Boolean checkAquariumIDAndCapacity(String aquariumID, Integer aquariumCapacity) {
		refreshAquariumListData();
		Aquarium a = null;
		for (Aquarium aquarium : aquariumList) {
			if (aquariumID.equals(aquarium.getAquariumID())) {
				a = aquarium;
				break;
			}
		}

		if (a == null) {
			return false;
		} else {
			String query = String.format("SELECT SUM(FishAmount) FROM fishSpecies WHERE AquariumId = '%s'", aquariumID);
			ResultSet rs = db.executeQuery(query);
			try {
				while (rs.next()) {
					Integer currentFishTotal = rs.getInt(1);
					if (currentFishTotal + aquariumCapacity > a.getAquariumCapacity()) {
						return false;
					} else {
						return true;
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	void insertNewFishSpesiesMenu() {
		cls();
		refreshFishListData();
		if (aquariumList.isEmpty()) {
			System.out.println("Please insert an aquarium");
		} else {
			String fishSpecies;
			do {
				System.out.print("Fish Species [5 - 10 character]: ");
				fishSpecies = sc.nextLine();
			} while (!(fishSpecies.length() >= 5 && fishSpecies.length() <= 10));

			String fishSpeciesType;
			do {
				System.out.print("Fish Species Type [must be 'Freshwater' or 'Saltwater' (case sensitive)]: ");
				fishSpeciesType = sc.nextLine();
			} while (!(fishSpeciesType.equals("Freshwater") || fishSpeciesType.equals("Saltwater")));

			Integer fishAmount;
			do {
				System.out.print("Fish Amount [must be more than 0]: ");
				fishAmount = sc.nextInt();
				sc.nextLine();
			} while (!(fishAmount > 0));

			String aquariumID;
			do {
				System.out.print(
						"Aquarium Id [must be in the database and the amount of cannot exceed the aquarium capacity]: ");
				aquariumID = sc.nextLine();

			} while ((checkAquariumIDAndCapacity(aquariumID, fishAmount).equals(false)));

			String fishSpeciesID;
			fishSpeciesID = GenerateFishSpeciesID();
			while (!checkFishSpeciesID(fishSpeciesID)) {
				fishSpeciesID = GenerateFishSpeciesID();
			}

			String query = String.format("INSERT INTO fishspecies VALUES ('%s', '%s', '%s', '%d', '%s')", fishSpeciesID,
					fishSpecies, fishSpeciesType, fishAmount, aquariumID);
			db.executeUpdate(query);
		}
	}

	void viewFishSpecies() {
		cls();
		refreshFishListData();
		if (fishList.isEmpty()) {
			System.out.println("There is no fish");
		} else {
			for (Fish fish : fishList) {
				fish.showFishDetail();
			}
		}
	}

	Boolean checkFishAmount(String fishSpeciesID, Integer soldAmount) {
		refreshFishListData();
		Fish f = null;
		for (Fish fish : fishList) {
			if (fishSpeciesID.equals(fish.getFishSpeciasID())) {
				f = fish;
				break;
			}
		}
		if (soldAmount > f.getFishAmount()) {
			return true;
		} else {
			return false;
		}
	}

	void checkFishSpeciesForDeletion(String fishSpeciesID) {
		refreshFishListData();
		Fish f = null;

		for (Fish fish : fishList) {
			if (fish.getFishSpeciasID().equals(fishSpeciesID)) {
				f = fish;
				break;
			}
		}

		if (f.getFishAmount().equals(0)) {
			showSellMessage(fishSpeciesID);
			String query = String.format("DELETE FROM fishspecies WHERE fishSpeciesId = '%s'", fishSpeciesID);
			db.executeUpdate(query);
		}
	}

	void showSellMessage(String fishSpeciesID) {
		refreshFishListData();
		Fish f = null;

		for (Fish fish : fishList) {
			if (fish.getFishSpeciasID().equals(fishSpeciesID)) {
				f = fish;
				break;
			}
		}

		f.showSellMessage();
	}

	void sellFishMenu() {
		cls();
		refreshFishListData();
		if (fishList.isEmpty()) {
			System.out.println("There is no fish");
		} else {
			for (Fish fish : fishList) {
				fish.showFishDetail();
			}

			String fishspeciesID;
			do {
				System.out.println("Fish Species ID [must exist]: ");
				fishspeciesID = sc.nextLine();
			} while (checkFishSpeciesID(fishspeciesID));

			Integer fishSold;
			do {
				System.out.println("Fish amout be sold [must not be more than the existing amout]: ");
				fishSold = sc.nextInt();
				sc.nextLine();
			} while (checkFishAmount(fishspeciesID, fishSold));

			String query = String.format(
					"UPDATE fishspecies SET fishAmount = fishAmount - %d WHERE fishSpeciesId = '%s'", fishSold,
					fishspeciesID);
			db.executeUpdate(query);

			refreshFishListData();
			checkFishSpeciesForDeletion(fishspeciesID);

		}

	}

	public Main() {

		Integer userInput = 0;
		do {
			printMainMenu();
			userInput = sc.nextInt();
			sc.nextLine();
			switch (userInput) {
			case 1:
				insertNewFishSpesiesMenu();
				break;
			case 2:
				viewFishSpecies();
				break;
			case 3:
				sellFishMenu();
				break;
			case 4:
				addAquariumMenu();
				break;
			case 5:
				showAquariumsMenu();
				break;

			default:
				break;
			}
		} while (userInput != 6);
	}

	public static void main(String[] args) {
		new Main();
	}

}
