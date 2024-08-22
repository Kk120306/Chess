package Java;

public class Rook extends Piece {
    public Rook(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isValidMove(Position pos) {
        // Method to check if the move is valid for a rook
        return false;
    }

    @Override
    public List<Position> getPossibleMoves() {
        // Method to get all possible moves for a rook
        return null;
    }
}

