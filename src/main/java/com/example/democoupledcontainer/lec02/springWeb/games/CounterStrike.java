package com.example.democoupledcontainer.lec02.springWeb.games;

public class CounterStrike implements Game {
    public void launch() {
        System.out.println("Launching Counter Strike...");
        loadGame();
        keyUp();
        keyDown();
        keyLeft();
        keyRight();
    }

    public void loadGame() {
        System.out.println("Loading Counter Strike game...");
    }

    public void keyUp() {
        System.out.println("Counter Strike key up...");
    }

    public void keyDown() {
        System.out.println("Counter Strike key down...");
    }

    public void keyLeft() {
        System.out.println("Counter Strike key left...");
    }

    public void keyRight() {
        System.out.println("Counter Strike key right...");
    }

}
