package prakasit.work.monopoly;

import org.example.Models.MGame;
import org.example.Models.Player;

public class Main {
    public static void main(String[] args) {
        MGame mGame = new MGame();
        mGame.addPlayer("Player1");
        mGame.addPlayer("Player2");
        mGame.addPlayer("Player3");
        mGame.addPlayer("Player4");
        mGame.addPlayer("Player5");
        mGame.addPlayer("Player6");
        mGame.addPlayer("Player7");
        mGame.addPlayer("Player8");
        mGame.playGame();
    }
}