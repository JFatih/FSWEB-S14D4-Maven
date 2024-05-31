package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek",2000,40);
        Monster wolf = new Werewolf("wolf", 700,100);
        printAttackResult(shrek);
        printAttackResult(wolf);
    }

    public static void printAttackResult(Monster monster){
        System.out.println("Attack result of:" + monster.getName() + ": " + monster.attack());
    }
}
