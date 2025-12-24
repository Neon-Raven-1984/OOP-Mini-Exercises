package com.example;

public class Mage extends GameCharacter {

    public Mage(String name) {
        super(name, 80, 25);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("✨ Mage casts a spell!");
        super.attack(target);
    }
}
