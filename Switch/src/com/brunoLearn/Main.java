package com.brunoLearn;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 2;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

//        char myChar = 'B';
//
//        switch (myChar) {
//            case 'A':
//                System.out.println("Your char was found: " + myChar);
//                break;
//            case 'B': case 'C': case 'D' : case 'E':
//                System.out.println("We found your char: " + myChar);
//                break;
//            default:
//                System.out.println("Your char was not found.");
//                break;
//        }

        String month = "FebruarY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

    }
}
