// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.modelsForUI;

import java.util.ArrayList;

public class MGameWithUI {
    private int roundCount;
    private Die dice[];
    private Board board;
    private ArrayList<Player> players;

    private int currentPlayerIndex = 0;

    public MGameWithUI() {
        this.roundCount = 1;
        this.dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();
        this.board = new Board();
        this.players = new ArrayList<>();
    }

    public void addPlayer(String name) {
        Player player = new Player(name, dice, board);
        this.players.add(player);
    }

    public Player playGame(int n) {
        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
            roundCount++;
        }

        if (roundCount > n) {
            return null;
        }

        return playRound(n);
    }

    public Player playRound(int n){
        Player player = players.get(currentPlayerIndex);
        currentPlayerIndex++;
        return player;
    }

    public int getRoundCount() {
        return roundCount;
    }
}