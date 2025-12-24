package com.example;

public class GameCharacter {

    private String name;
    private int level;
    private int health;
    private int attackPower;

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
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        level++;
        health += 20;
        attackPower += 5;
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
