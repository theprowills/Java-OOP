package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Animal;
import model.Canine;
import model.Feline;

public class Main {

	Integer mostFeline = 0;
	Integer mostCanine = 0;

	Integer currFeline = 0;
	Integer currCanine = 0;

	Scanner sc = new Scanner(System.in);
	ArrayList<Animal> animalList = new ArrayList<>();

	void updateMostCanineAndFeline() {
//		Integer felineCounter = 0;
//		Integer canineCounter = 0;
//		
//		for (Animal animal : animalList) {
//			if(animal instanceof Feline) {
//				felineCounter++;
//			} else {
//				canineCounter++;
//			}
//		}
//		
//		if (currCanine > mostCanine) {
//			mostCanine = currCanine;
//		}
//		
//		if (currFeline > mostFeline) {
//			mostFeline = currFeline;
//		}

		for (Animal animal : animalList) {
			if (animal instanceof Feline) {
				currFeline++;
			} else {
				currCanine++;
			}
		}

		if (currCanine > mostCanine) {
			mostCanine = currCanine;
		}

		if (currFeline > mostFeline) {
			mostFeline = currFeline;
		}
	}

	public void clearScreen() {
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
	}

	public void printMainMenu() {
		clearScreen();
		System.out.println("=======================");
		System.out.println("Menu List");
		System.out.println("=======================");
		System.out.println("1.	Add Zoo Animal");
		System.out.println("2.	View Zoo Animal");
		System.out.println("3.	Take For A Walk");
		System.out.println("4.	Release Zoo Animal");
		System.out.println("5.	Close Program");
		System.out.println("=======================");
		System.out.print("Choice >> ");
	}

	public void addNewAnimalMenu() {
		String name;
		String gender;
		String genus;

		do {
			System.out.print("Animal name [5-15 character]: ");
			name = sc.nextLine();
		} while (!(name.length() >= 5 && name.length() <= 15));
//		} while (name.length() < 5 || name.length() > 15);

		do {
			System.out.print("Animal gender [male|female]: ");
			gender = sc.nextLine();
		} while (!(gender.equals("male") || gender.equals("female")));

		do {
			System.out.print("Animal genus [canine|feline]: ");
			genus = sc.nextLine();
		} while (!(genus.equals("canine") || genus.equals("feline")));

		int walkingSpeed = 0;
		String mood = "";
		if (genus.equals("canine")) {
			do {
				System.out.print("Animal speed [1-80]: ");
				try {
					walkingSpeed = sc.nextInt();
				} catch (Exception e) {
					// TODO: handle exception

				}
				sc.nextLine();
			} while (!(walkingSpeed >= 1 && walkingSpeed <= 80));

			Canine newCanine = new Canine(name, gender, mood, walkingSpeed);
			animalList.add(newCanine);

		} else {
			Feline newFeline = new Feline(name, gender, mood);
			animalList.add(newFeline);
		}
		updateMostCanineAndFeline();
		System.out.println("Another animal has joined the zoo!!");
	}

	void viewZooAnimalMenu() {
		clearScreen();

		System.out.println("No. Name Genus Mood Gender");

		if (animalList.isEmpty()) {
			System.out.println("No zoo Animal Spotted");
		} else {
			Integer animalCounter = 1;
			for (Animal animal : animalList) {
				animal.updateMood(currCanine, currFeline, mostCanine, mostFeline);
				animal.printAnimalStatus(animalCounter);
				System.out.println("");
				animalCounter++;
			}
		}
	}

	void takeForWalk() {
		Random rand = new Random();

		rand.nextInt(10);
	}

	// constructor
	public Main() {
		// TODO Auto-generated constructor stub
		Integer userMainMenuInput;

		do {

			printMainMenu();
			userMainMenuInput = sc.nextInt();
			sc.nextLine();

			if (userMainMenuInput == 1) {
				addNewAnimalMenu();
			} else if (userMainMenuInput == 2) {
				viewZooAnimalMenu();
			} else if (userMainMenuInput == 3) {

			}

		} while (userMainMenuInput != 5);

	}

	// entry point: tempat program pertama kali dijalankan
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
