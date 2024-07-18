package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import db.Connect;
import model.Aquarium;

public class Main {
//	Connect db = new Connect();
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	ArrayList<Aquarium> aquariumList = new ArrayList();

	void refreshAquariumListData() {
		// kosongin data
		ArrayList<Aquarium> tempo = new ArrayList();
		// tarik data terbaru
		String query = "SELECT * FROM aquarium";
//		ResultSet rs = db.executeQuery(query);

//		try {
//			while (rs.next()) {
//				String aquariumID = rs.getString("AquariumId");
//				String aquariumColor = rs.getString("AquariumColor");
//				Integer aquariumCapacity = rs.getInt("AquariumCapacity");
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// masukin ulang ke arrlist aq

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

	String GenerateAquariumID() {
		String id = "AQ";
		Integer a = rand.nextInt(10);
		Integer b = rand.nextInt(10);
		Integer c = rand.nextInt(10);

		String finalID;
		finalID = id + a + b + c;

		return finalID;

	}

	void addAquarium() {
		cls();
		String aquariumColor;
		do {
			System.out.println("Aquarium Color: must be 'Green' or 'Red' or 'Blue' (case sensitive)");
			aquariumColor = sc.nextLine();
		} while (!(aquariumColor.equals("Red") || aquariumColor.equals("Green") || aquariumColor.equals("BLue")));

		Integer aquariumCapacity;
		do {
			System.out.println("Aquarium Capacity: must be between 100 - 500 (inclusive)");
			aquariumCapacity = sc.nextInt();
			sc.nextLine();
		} while (!(aquariumCapacity >= 100 && aquariumCapacity <= 500));

		String genAqID;

	}

	public Main() {

		Integer userInput = 0;
		do {
			userInput = sc.nextInt();
			sc.nextLine();
			printMainMenu();
			switch (userInput) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				addAquarium();
				break;
			case 5:

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
