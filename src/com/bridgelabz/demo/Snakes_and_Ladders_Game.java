package com.bridgelabz.demo;

public class Snakes_and_Ladders_Game {

	public static void main(String[] args) {

		System.out.print("Welcome to the Snakes and Ladders Game");

		int player = 0;
		System.out.print("Player intitial position: " + player);

		int dice = (int) ((Math.random() * 10) % 6) + 1;

		System.out.println("Dice is rolled " + dice);

	}

}
