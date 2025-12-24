package com.example;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Aragorn");
        Mage mage = new Mage("Gandalf");

        do {
            
            System.out.println(warrior);
            System.out.println(mage);

            warrior.attack(mage);
            mage.attack(warrior);

            if (warrior.isAlive()){
                warrior.levelUp();
            }
            if (mage.isAlive()){
                mage.levelUp();
            }

            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }

            System.out.println("-------------------------");
    
        } while (warrior.isAlive() && mage.isAlive());

        if (warrior.isAlive()) {
            System.out.println(warrior.getName() + " wins!");
        } else if (mage.isAlive()) {
            System.out.println(mage.getName() + " wins!");
        } else {
            System.out.println("Both characters have fallen!");
        }

    }
}
