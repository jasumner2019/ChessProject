public class King extends Piece {

    public King(String color, Position position) {
        super("King", color, position, "K");
    }

    @Override
    public boolean isValidMove(Position newPosition, Board board) {
        // King can move one square in any direction
        int fileDiff = Math.abs(newPosition.getFile() - getPosition().getFile());
        int rankDiff = Math.abs(newPosition.getRank() - getPosition().getRank());

        // Check if the move is within the board
        if (!isWithinBoard(newPosition)) {
            return false;
        }

        // King moves one square at a time in any direction
        if (fileDiff <= 1 && rankDiff <= 1 && (fileDiff != 0 || rankDiff != 0)) {
            // Check if the destination square is empty or occupied by an opponent's piece
            Piece pieceAtDestination = board.getPieceAt(newPosition);
            return pieceAtDestination == null || !pieceAtDestination.getColor().equals(this.getColor());
        }

        return false;
    }
}
