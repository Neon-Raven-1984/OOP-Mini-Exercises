package com.example;

public class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name, 120, 15);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("⚔ Warrior powerful attack!");
        super.attack(target);
    }
}
