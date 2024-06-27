package prakasit.work.monopoly.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Board() {
        this.squares = new ArrayList<Square>();
        for(int i = 1;i <= 40; i++) {
            squares.add(new Square("Person : "+i));
        }
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public void setSquares(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLoc, int[] fvTot) {
        int index = squares.indexOf(oldLoc);
        Square result = squares.get(index + fvTot[0] + fvTot[1]);
        return result;
    }
}