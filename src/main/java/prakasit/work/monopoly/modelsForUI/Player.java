// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.modelsForUI;

public class Player {
    private String name;
    private Die dice[];
    private Board board;
    private Piece piece;

    public Player(String name, Die[] dice, Board board) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        this.piece = new Piece();
    }

    public Die[]  takeTurn(){
        int fvTot = 0;
        for(Die die : dice){
            die.roll();
            fvTot += die.getFaceValue();
        }

        System.out.println(name);

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
        return dice;
    }

    public String getName() {
        return name;
    }

}