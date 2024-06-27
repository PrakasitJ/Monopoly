package prakasit.work.monopoly.models;

import javax.swing.*;
import java.util.ArrayList;

public class MGame {
    private int roundCount;
    private Die dice[];
    private Board board;
    private Player players[];

    public MGame() {
        this.roundCount = 0;
        this.dice = new Die[2];
        this.board = new Board();
        this.players = new Player[8];
    }

    public Die[] getDice() {
        return dice;
    }

    public Board getBoard() {
        return board;
    }

    public void addPlayer(String name) {
        Player player = new Player(name, dice, board);
        this.players[this.players.length-1] = player;
    }

    public void playGame(){
        int n = 50;
        while(roundCount < n){
            playRound();
        }

    }

    private void playRound(){
        for(Player player: players){
            player.takeTurn();
        }
    }
}