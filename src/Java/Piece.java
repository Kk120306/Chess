package Java;

import java.util.List;

public abstract class Piece {
    protected Color color;
    protected Position position;

    public Piece(Color color, Position position) {
        this.color = color;
        this.position = position;

    }

    public void moveTo(Position pos) {
        this.position = pos
    }

    public abstract boolean isValidMove(Position pos);

    public abstract List<Position> getPossibleMoves();

    public String toJSON() {
        return "{ \"type\": \"" + this.getClass().getSimpleName() + "\", " +
                "\"color\": \"" + color + "\", " +
                "\"position\": " + position.toString() + " }";
    }

    public void fromJSON(String json) {
        // Method to load piece state from JSON
    }
}

