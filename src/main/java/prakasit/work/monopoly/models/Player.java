package prakasit.work.monopoly.models;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Die[] getDice() {
        return dice;
    }

    public void setDice(Die[] dice) {
        this.dice = dice;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void  takeTurn(){
        int fvTot[] = new int[2];
        int i = 0;
        for(Die die : dice){
            die.roll();
            fvTot[i] = die.getFaceValue();
            i++;
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);

    }

}