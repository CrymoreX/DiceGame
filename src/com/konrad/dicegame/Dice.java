package com.konrad.dicegame;

import java.util.Random;

public class Dice {

                int dice() { // Gets the info from random numbers between 1 and 6

                        Random random = new Random();
                        int dice;
                       dice = random.nextInt(1,7);
                       return dice;
                }


        }






