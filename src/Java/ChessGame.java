package Java;

public class ChessGame {
    private ChessBoard board;
    private boolean isWhiteTurn;
    private boolean gameOver;

    public ChessGame() {
        // Constructor code
        this.board = new ChessBoard();
        this.isWhiteTurn = true;
        this.gameOver = false;
    }

    public void startGame() {
        // Method to start the game
        this.board.initialize();
        this.isWhiteTurn = true;
        this.gameOver = false;

    }

    public boolean makeMove(Position start, Position end) {
        Piece piece = board.getPieceAt(start);
        if (piece == null || piece.getColor() != (isWhiteTurn ? Color.WHITE : Color.BLACK)) {
            return false; // No piece to move or wrong turn
        }

        if (piece.isValidMove(end)) {
            board.setPieceAt(end, piece);
            board.setPieceAt(start, null);
            piece.moveTo(end);
            isWhiteTurn = !isWhiteTurn;
            checkGameOver();
            return true;
        }

        return false;
    }

    public boolean checkGameOver() {
        this.gameOver = !board.isKingPresent(Color.WHITE) || !board.isKingPresent(Color.BLACK);
        return this.gameOver;
    }

    public String getGameState() {
        // Method to get the current game state
        return "";
    }

    public void saveGameState() {
        // Method to save the game state
    }

    public void loadGameState() {
        // Method to load the game state
    }

    public String toJSON() {
        // Method to convert game state to JSON
        return "";
    }

    public void fromJSON(String json) {
        // Method to load game state from JSON
    }
}

