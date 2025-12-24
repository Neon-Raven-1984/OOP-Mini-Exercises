package com.example;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Aragorn");
        Mage mage = new Mage("Gandalf");

        System.out.println(warrior);
        System.out.println(mage);

        warrior.attack(mage);
        mage.attack(warrior);

        System.out.println(warrior);
        System.out.println(mage);

        warrior.levelUp();
        mage.levelUp();

        System.out.println(warrior);
        System.out.println(mage);
    }
}
