package com.brunoLearn;

public class Main {

    public static void main(String[] args) {

        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue " + myNewByteValue);

        // short has a width of 16
        short myShortValue = -32768;
//        short myNewShortValue = ("myNewShortValue " + mynewsh)

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

    }
}
