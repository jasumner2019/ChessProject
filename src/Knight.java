public class Knight extends Piece {
    public Knight(String color, Position position) {
        super("Knight", color, position, "N");
    }
    @Override
    public boolean isValidMove(Position newPosition, Board board) {
        // Check if the move is within the board
        if (!isWithinBoard(newPosition)) {
            return false;
        }

        int fileDiff = Math.abs(newPosition.getFile() - getPosition().getFile());
        int rankDiff = Math.abs(newPosition.getRank() - getPosition().getRank());

        // Knight moves in an L-shape: 2 squares in one direction and 1 square perpendicular to that
        boolean isValidKnightMove = (fileDiff == 2 && rankDiff == 1) || (fileDiff == 1 && rankDiff == 2);

        if (!isValidKnightMove) {
            return false;
        }

        // Check if the destination square is empty or occupied by an opponent's piece
        Piece pieceAtDestination = board.getPieceAt(newPosition);
        return pieceAtDestination == null || !pieceAtDestination.getColor().equals(this.getColor());
    }
}
