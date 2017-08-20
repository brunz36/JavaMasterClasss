package com.brunoLearn;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//
//	    while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//	        if(count == 5) {
//	            break;
//            }
//            System.out.println("Count value is " + count);
//	        count++;
//        }
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while(count != 6);
        System.out.println(isEvenNumber(3));
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
