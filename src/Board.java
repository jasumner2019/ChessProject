import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Position, Piece> pieces;

    public Board() {
        this.pieces = new HashMap<>();
    }

    public void addPiece(Piece piece) {
        pieces.put(piece.getPosition(), piece);
    }

    public void removePiece(Position position) {
        pieces.remove(position);
    }

    public void printBoard() {
        System.out.println("  " + "-".repeat(41));
        for (int rank = 8; rank >= 1; rank--) {
            System.out.print(rank + " ");
            for (char file = 'a'; file <= 'h'; file++) {
                Position pos = new Position(String.valueOf(file), rank);
                Piece piece = pieces.get(pos);
                System.out.print("| " + (piece != null ? pieceToString(piece) : "  ") + " ");
            }
            System.out.println("|");
            System.out.println("  " + "-".repeat(41));
        }
        System.out.println("    A    B    C    D    E    F    G    H");
    }

    private String pieceToString(Piece piece) {
        return piece.getColor().substring(0, 1).toUpperCase() + piece.getSymbol();
    }
    public Piece getPieceAt(Position position) {
        return pieces.get(position);
    }
}
