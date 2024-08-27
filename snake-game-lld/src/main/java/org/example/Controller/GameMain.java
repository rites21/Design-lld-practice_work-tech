package org.example.Controller;

import org.example.Model.Ladder;
import org.example.Model.Player;
import org.example.Model.Snake;
import org.example.Service.SnakeAndLadderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of snake");

        int noOfSnake = sc.nextInt();
        List<Snake> snakes = new ArrayList<>();
        for(int i = 0; i < noOfSnake; i++){
            snakes.add(new Snake(sc.nextInt(), sc.nextInt()));
        }

        System.out.println("Enter no of Ladders");

        int noOfLadder = sc.nextInt();
        List<Ladder> ladders = new ArrayList<>();
        for(int i = 0; i < noOfSnake; i++){
            ladders.add(new Ladder(sc.nextInt(), sc.nextInt()));
        }

        System.out.println("Enter no of Players");

        int noOfPlayer = sc.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i = 0; i < noOfSnake; i++){
            players.add(new Player(sc.next()));
        }

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setLadders(ladders);

        snakeAndLadderService.startGame();

    }


}
