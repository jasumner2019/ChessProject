public class Rook extends Piece {
    public Rook(String color, Position position) {
        super("Rook", color, position, "R");
    }

    @Override
    public boolean isValidMove(Position newPosition, Board board) {
        if (!isWithinBoard(newPosition)) {
            return false;
        }

        int fileDiff = Math.abs(newPosition.getFile() - getPosition().getFile());
        int rankDiff = Math.abs(newPosition.getRank() - getPosition().getRank());

        // Rook moves horizontally or vertically, so either file or rank must remain the same
        if (fileDiff != 0 && rankDiff != 0) {
            return false;
        }

        // Check if the path is clear
        if (!isPathClear(newPosition, board)) {
            return false;
        }

        // Check if the destination square is empty or occupied by an opponent's piece
        Piece pieceAtDestination = board.getPieceAt(newPosition);
        return pieceAtDestination == null || !pieceAtDestination.getColor().equals(this.getColor());
    }

    private boolean isPathClear(Position newPosition, Board board) {
        int fileStep = Integer.compare(newPosition.getFile() - getPosition().getFile(), 0);
        int rankStep = Integer.compare(newPosition.getRank() - getPosition().getRank(), 0);

        Position currentPos = getPosition();
        while (!currentPos.equals(newPosition)) {
            currentPos = new Position(
                    String.valueOf((char)(currentPos.getFile() + fileStep)),
                    currentPos.getRank() + rankStep
            );
            if (currentPos.equals(newPosition)) break; // Don't check the final position
            if (board.getPieceAt(currentPos) != null) {
                return false; // Path is blocked
            }
        }
        return true; // Path is clear
    }
}
