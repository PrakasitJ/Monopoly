// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly;

import prakasit.work.monopoly.models.MGame;

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
        mGame.playGame(50);
    }
}