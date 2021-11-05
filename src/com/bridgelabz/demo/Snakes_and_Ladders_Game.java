package com.bridgelabz.demo;

public class Snakes_and_Ladders_Game {

	final static int max_position = 100;

	public static void main(String[] args) {

		System.out.print("Welcome to the Snakes and Ladders Game");

		int NO_PLAY = 0;
		int snake = 1;
		int ladder = 2;
		int player = 0;
		int no_of_dice_rolled = 100;

		while (player < max_position) {
			int dice = (int) ((Math.random() * 10) % 6) + 1;
			System.out.println("Dice is rolled " + dice);

			int move = (int) ((Math.random() * 10) % 3);
			if (move == NO_PLAY) {
				System.out.println("The Player Stays in the same position");

			} else {
				if (move == snake) {

					int temp1 = player - dice;
					if (temp1 < 0) {
						player = 0;
					} else {
						player = temp1;
					}

				} else {
					if (move == ladder) {

						int temp2 = player + dice;
						if (temp2 <= 100) {
							player = temp2;

						}

					}
					no_of_dice_rolled++;
					System.out.println("player position " + player);

				}
				System.out.println("Player win the Game");
				System.out.println("Total number of dice rolled to win the game is " + no_of_dice_rolled);

			}

		}
	}
}