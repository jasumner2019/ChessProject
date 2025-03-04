public class Pawn extends Piece {
    public Pawn(String color, Position position) {
        super("Pawn", color, position, "P");
    }

    @Override
    public boolean isValidMove(Position newPosition, Board board) {
        if (!isWithinBoard(newPosition)) {
            return false;
        }

        int fileDiff = newPosition.getFile() - getPosition().getFile();
        int rankDiff = newPosition.getRank() - getPosition().getRank();

        // Determine the direction of movement based on the pawn's color
        int forwardDirection = getColor().equalsIgnoreCase("White") ? 1 : -1;

        // Normal forward move (1 square)
        if (fileDiff == 0 && rankDiff == forwardDirection) {
            // Check if the square directly in front is empty
            return board.getPieceAt(newPosition) == null;
        }

        // First move: 2 squares forward
        if (fileDiff == 0 && rankDiff == 2 * forwardDirection && isFirstMove()) {
            // Check if both squares in front are empty
            Position intermediatePosition = new Position(
                    String.valueOf(getPosition().getFile()),
                    getPosition().getRank() + forwardDirection
            );
            return board.getPieceAt(intermediatePosition) == null && board.getPieceAt(newPosition) == null;
        }

        // Capturing diagonally
        if (Math.abs(fileDiff) == 1 && rankDiff == forwardDirection) {
            Piece pieceAtDestination = board.getPieceAt(newPosition);
            return pieceAtDestination != null && !pieceAtDestination.getColor().equals(this.getColor());
        }

        // If none of the conditions are met, it's not a valid move
        return false;
    }

    private boolean isFirstMove() {
        // A pawn's first move is determined by its starting rank
        return getColor().equalsIgnoreCase("White") ? getPosition().getRank() == 2 : getPosition().getRank() == 7;
    }
}
