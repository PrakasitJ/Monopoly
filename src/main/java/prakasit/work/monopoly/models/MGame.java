// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.models;
import java.util.ArrayList;

public class MGame {
    private int roundCount;
    private Die dice[];
    private Board board;
    private ArrayList<Player> players;

    public MGame() {
        this.roundCount = 0;
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

    public void playGame(int n){
        while(roundCount < n){
            playRound();
            roundCount++;
        }

    }

    private void playRound(){
        for(Player player: players){
            player.takeTurn();
        }
    }
}