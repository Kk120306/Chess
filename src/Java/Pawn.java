package Java;

public class Pawn extends Piece {
    public Pawn(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isValidMove(Position pos) {
        // Method to check if the move is valid for a pawn
        
        return false;
    }

    @Override
    public List<Position> getPossibleMoves() {
        // Method to get all possible moves for a pawn
        return null;
    }
}

