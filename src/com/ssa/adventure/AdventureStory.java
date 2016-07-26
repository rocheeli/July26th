package com.ssa.adventure;

import java.util.Scanner;

public class AdventureStory {
	private static Scanner sc = new Scanner(System.in);

	private static boolean stillPlaying = true;

	public static void main(String[] args) {

		while (stillPlaying) {
			stillPlaying = true;
			System.out.println("Welcome to the Labyrinth!  Choose your path wisely, if you want to reach the castle.");
			System.out.println("Would you like to go \n" + "\tS: Straight\n" + "\tL: Left\n" + "\tR: Right\n");

			String directionToGo = sc.nextLine();

			directionChosen(directionToGo);
		}
	}

	public static boolean directionChosen(String directionToGo) {

		switch (directionToGo.toLowerCase()) {
		case "s":
			whatYouEncounterStraight();
			break;

		case "l":
			whatYouEncounterLeft();
			break;

		case "r":
			whatYouEncounterRight();
			break;

		default:
			System.out.println("I'm sorry, you have made an error. Try again");
			System.exit(0);

			return stillPlaying;

		}
		return stillPlaying;
	}

	public static boolean whatYouEncounterStraight() {
		System.out.println("You have gone straight.");
		System.out.println("You have encountered two doors." + "\nWhich door should you choose?"
				+ "\n\t1: I pick door number one" + "\n\t2: I pick door number two");

		String doorInput = sc.nextLine();
		chosenDoor(doorInput);

		return stillPlaying;
	}

	public static boolean chosenDoor(String doorInput) {
		switch (doorInput.toLowerCase()) {
		case "1":
			doorPickOne();
			break;

		case "2":
			doorPickTwo();
			break;

		default:
			System.out.println("I'm sorry, you have made an error. Try again");
			System.exit(0);

		}
		return stillPlaying;
	}

	public static boolean doorPickOne() {
		System.out.println("You have picked door one.");
		System.out.println("Whoops, you have fallen into the bog of eternal stench");
		System.out.println("Would you like to play again" + "\n\tY: yes" + "\n\tN: no");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
		return stillPlaying;

	}

	public static boolean doorPickTwo() {
		System.out.println("You have picked door two.");
		System.out.println("You have exited the Labyrinth.");
		System.out.println("Would you like to play again" + "\n\tY: yes" + "\n\tN: no");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
		return stillPlaying;

	}

	public static boolean whatYouEncounterLeft() {
		System.out.println("You have gone left.");
		System.out.println("You have encountered the headhunters." + "\nWhat do you want to do?" + "\n\tr: Run"
				+ "\n\tp: Pull off their heads");

		String headhunterInput = sc.nextLine();
		
		headhunterReaction(headhunterInput);

		return stillPlaying;
	}

	public static boolean headhunterReaction(String headhunterInput) {
		switch (headhunterInput.toLowerCase()) {
		case "r":
			run();
			return stillPlaying;

		case "p":
			pullHeads();
			return stillPlaying;

		default:
			System.out.println("I'm sorry, you have made an error. Try again");
			return stillPlaying;
		}

	}

	public static boolean run() {
		System.out.println("You ran!.");
		System.out.println("You are lost in the labyrinth");

		System.out.println("Would you like to play again" + "\n\tY: yes" + "\n\tN: no");

		String stayOrGo = sc.nextLine();
		
		theFinalMethod(stayOrGo);

		return stillPlaying;
	}

	public static boolean pullHeads() {
		System.out.println("You pulled off their heads.");
		System.out.println("Darn, their bodies kicked you into fire.");

		System.out.println("Would you like to play again" + "\n\tY: yes" + "\n\tN: no");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);

		return stillPlaying;
	}

	public static boolean whatYouEncounterRight() {
		System.out.println("You have gone right.");
		System.out.println("The castle is dead ahead." + "\nWhat do you do next?" + "\n\tw: Walk in front door"
				+ "\n\ts: Sneak in through window");
		String castleInput = sc.nextLine();
		castleEntrance(castleInput);
		return stillPlaying;
	}

	public static boolean castleEntrance(String castleInput) {
		switch (castleInput.toLowerCase()) {
		case "w":
			frontDoor();
			break;

		case "s":
			throughWindow();
			break;

		default:
			System.out.println("I'm sorry, you have made an error. Try again");
			System.exit(0);
		}
		return stillPlaying;
	}

	public static void frontDoor() {
		System.out.println("The Goblin King is angry.");
		System.out.println("Uh Oh, he will keep the baby ");

		
		System.out.println("Would you like to play again" + "\n\tY: yes" + "\n\tN: no");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
		return;
	}

	public static boolean throughWindow() {
		System.out.println("You have caught the Goblin King dancing");
		System.out.println("You saved the baby!");

		
		System.out.println("Would you like to play again" + "\n\tY: yes" + "\n\tN: no");

		String stayOrGo = sc.nextLine();
		theFinalMethod(stayOrGo);
		return stillPlaying;
	}

	public static boolean theFinalMethod(String sog) {

		switch (sog.toLowerCase()) {
		case "y":
			return stillPlaying;
		case "n":
			stillPlaying = false;
			return stillPlaying;
		default:
			return stillPlaying;
		}

	}

}
