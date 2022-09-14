package com.konrad.dicegame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("<<< Welcome to the Game of Dice >>>\n"); // Step 1


        // Instantiate Objects
        int playerOne = 0; // Total amount of points for player one
        int playerTwo = 0; // Total amount of points for player one
        int sum = 0;
        int dice = 0; // Throws the dice 2 times
        int rounds = 5; // Amount of given rounds
        boolean isPlaying = true;


        Scanner scanner = new Scanner(System.in);


            System.out.println("You are going to play 5 rounds\n ");

            Player playerName = new Player(); // Info from class Player

            System.out.println("Player one name?");
            String nameOne = playerName.player(); // Input player name

            System.out.println("Player two name?");
            String nameTwo = playerName.player(); // Input player name

            System.out.println("How many Dice?");
            dice = scanner.nextInt(); // Input dice number


            do {

               Dice diceThrow = new Dice(); // Gets info from class Dice


                for (int i = 0; i < rounds; i++) {
                    sum = 0;  // Reset each round
                    System.out.println("________");
                    System.out.println("Round: " + (i + 1));
                    System.out.println("________");


                    for (int j = 0; j < dice; j++) {
                        int scoreOne = diceThrow.dice(); // Get number between 1 and 6
                        System.out.println(nameOne + " rolled: " + scoreOne);
                        playerOne += scoreOne;

                    }

                    for (int k = 0; k < dice; k++) {
                        int scoreTwo = diceThrow.dice(); // Get number between 1 and 6
                        System.out.println(nameTwo + " rolled: " + scoreTwo);
                        playerTwo += scoreTwo;

                    }

                }
                isPlaying = false;

                // Adds score from each round to a final score

                System.out.println("____________________");
                System.out.println(nameOne + " Total Score: " + playerOne);
                System.out.println(nameTwo + " Total Score: " + playerTwo);

                // Decides who won the round or if it is a tie

                if (playerOne > playerTwo) {
                    System.out.println(nameOne + " is the Champ!");
                } else if (playerTwo > playerOne) {
                    System.out.println(nameTwo + " is the Champ!");
                } else {
                    System.out.println("\nIt was a tie!");
                }
            }while (isPlaying) ;

        System.out.println("\n<<< Thank you for playing the Game of Dice >>>"); // End of code

        }}







