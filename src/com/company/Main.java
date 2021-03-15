package com.company;

import java.util.*;

class Game {
    HashMap<Integer, String> players;
    ArrayList<Integer> tpoints;
    Game() {
        players = new HashMap<Integer, String>();
        tpoints = new ArrayList<Integer>();
    }
    public void addPlayers(int p, String name) {
        players.put(p, name);
    }
    public void addpoints(int p) {
        tpoints.add(p);
    }
    public void getWinner() {
        int max = Collections.max(tpoints);
        System.out.println(players.get(max) + " has the highest points.");
    }

}

public class Main {

    public static void main(String[] args) {
        while(true) {
            Game bowling = new Game();
            try {
              Scanner input = new Scanner(System.in);
              System.out.print("How many players do you want to add: ");
              int numplayers = input.nextInt();
              System.out.println("Enter the names and points of the players separated by a Space:");

                for (int i = 0; i < numplayers; i++) {
                    String data = input.nextLine();
                    String[] arr = data.split(" ");
                    String name = arr[0];
                    int points = Integer.parseInt(arr[1]);
                    bowling.addpoints(points);
                    bowling.addPlayers(points, name);
                }
            } catch (InputMismatchException e) {
                System.out.println("Kindly enter the valid data!");
            } /*catch (Exception e) {
                System.out.println("Invalid data type!");
            } */

            bowling.getWinner();
        }

    }
}
