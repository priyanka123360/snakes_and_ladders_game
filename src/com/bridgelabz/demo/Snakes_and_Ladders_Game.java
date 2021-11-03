package com.bridgelabz.demo;

public class Snakes_and_Ladders_Game {
	final static int max_position = 100;

	public static void main(String[] args) {

		System.out.print("Welcome to the Snakes and Ladders Game");

		int NO_PLAY = 0;
		int snake = 1;
		int ladder = 2;
		int player = 0;
		int dice = (int) ((Math.random() * 10) % 6) + 1;
		System.out.println("Dice is rolled " + dice);

		int move = (int) ((Math.random() * 10) % 3);
		if (move == NO_PLAY) {
			System.out.println("The Player Stays in the same position");

		} else {
			if (move == snake) {

				int temp = player - dice;
				if (temp < 0) {
					player = 0;
				}

			} else {
				if (move == ladder) {
					player = player + dice;

				}

			}
			System.out.println("player position " + player);
		}

	}

}
