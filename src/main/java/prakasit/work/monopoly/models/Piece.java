package prakasit.work.monopoly.models;

public class Piece {
    private Square location;

    public Piece() {
        this.location = new Square("Location 1");
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}