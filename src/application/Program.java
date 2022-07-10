package application;

import entities.Champion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Champion> listChampions = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("How many champions you will add on the list? ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Name: ");
            s.nextLine();
            String name = s.nextLine();
            System.out.print("Life: ");
            int life = s.nextInt();
            System.out.print("Attack: ");
            int attack = s.nextInt();
            System.out.print("Armor: ");
            int armor = s.nextInt();
            listChampions.add(new Champion(name, life, attack,armor));
        }
        for(Champion champ : listChampions){
            System.out.printf("Name: %s%n" +
                              "Life: %d%n" +
                              "Attack: %d%n"+
                              "Armor: %d",champ.getName(),champ.getLife(),champ.getAttack(),champ.getArmor());
        }

    s.close();
    }
}
