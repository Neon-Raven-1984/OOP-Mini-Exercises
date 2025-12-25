package com.example;

import java.util.concurrent.ThreadLocalRandom;

public class GameCharacter {

    private String name;
    private int level;
    private int health;
    private int attackPower;
    private static double defenseMultiplier = 1;

    public String getName() {
        return name;
    }

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.level = 1;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(GameCharacter target) {
        System.out.println(name + " attacks " + target.name);
        target.takeDamage(attackPower);
    }

    public void takeDamage(int amount) {

        int chance = ThreadLocalRandom.current().nextInt(1, 101);
        int damage = amount;

        if (chance <= 20) {
            System.out.println("🔥 Critical Hit!");
            damage *= 2;
        }

        health -= damage;
        health -= Math.random() * damage * defenseMultiplier;
        if (health < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        level++;
        health += 15;
        attackPower += 5;
        defenseMultiplier -= 0.1;
        if (defenseMultiplier < 0.5) {
            defenseMultiplier = 0.5;
        }
        System.out.println(name + " leveled up to level " + level);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               " | Level: " + level +
               " | Health: " + health +
               " | Attack: " + attackPower;
    }
}
