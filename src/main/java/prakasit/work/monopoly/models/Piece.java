// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.models;

public class Piece {
    private Square location;

    public Piece() {
        this.location = new Square("Start");
    }
    public Square getLocation() {
        return location;
    }
    public void setLocation(Square location) {
        this.location = location;
    }
}