package com.brunoLearn;

public class Main {

    public static void main(String[] args) {
        Tacoma tacoma = new Tacoma(36);
        tacoma.steer(45);
        tacoma.accelerate(30);
        tacoma.accelerate(20);
        tacoma.accelerate(-45);
    }
}
