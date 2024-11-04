package com.btcag.bootcamp;

import java.util.Scanner;

public class Roboter {
    int hp;
    int energy;
    int shield;
    int damage;
    int range;
    int damageZone;
    int accuracy;
    int movementSpeed;
    int x;
    int y;
    String username;
    String roboterSymbol;
    String RESET;
    String RED;
    String BLUE;

    public Roboter(int x, int y, String username, String roboterSymbol) {
        this.hp = 1;
        this.energy = 1;
        this.shield = 1;
        this.damage = 1;
        this.range = 1;
        this.damageZone = 1;
        this.accuracy = 1;
        this.movementSpeed = 1;
        this.x = x;
        this.y = y;
        this.RESET = "\u001B[0m";
        this.RED = "\u001B[31m";
        this.BLUE = "\u001B[34m";
    }

    public int getPositionX(){
        return x;
    }

    public int getPositionY(){
        return y;
    }

    public String getRoboterSymbol(){
        return  roboterSymbol;
    }

    public void move(String direction){
        switch (direction){
            case "w" ->{
                y--;
            }
            case "q" ->{
                y--;
                x--;
            }
            case "e" ->{
                y--;
                x++;
            }
            case "y" ->{
                y++;
                x--;
            }
            case "c" ->{
                y++;
                x++;
            }
            case "a" ->{
                x--;
            }
            case "x" ->{
                y++;
            }
            case "d" ->{
                x++;
            }
        }
    }

    public int attack(){
        return damage;
    }

    public int doAction(int action, String direction){
        switch (action){
            case 1 -> {
                move(direction);
                return 0;
            }
            case 2 -> {
                return damage;
            }
        }
        return 0;
    }

    public int askAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte wähle einen Spielzug: \n [1] Bewegen \n [2] Angreifen");
        return scanner.nextInt();
    }

    public String askDirection(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe die Richtung ein: ");
        return scanner.nextLine();
    }

    public boolean checkPosition(int i, int j){
        return x == i && y == j;
    }

    public int getHp(){
        return hp;
    }

    public void getDamage(int damage){
        hp -= damage;
    }
}
