package com.brunoLearn;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Bruno", 500);
//        System.out.println("New score is " + newScore + ".");
//        calculateScore(75);
//        calculateScore();

        System.out.println("Feet and inches in centimeters " + calcFeetAndInchesToCentimeters(5, 11));
        System.out.println("Just inches to centimeters " + calcFeetAndInchesToCentimeters(55));
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score.");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet >= 0) && (inches >= 0 && inches <=12)) {
            return (((feet * 12) + inches) * 2.54);
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            return calcFeetAndInchesToCentimeters((inches / 12), (inches % 12));
        }
        return -1;
    }
}
