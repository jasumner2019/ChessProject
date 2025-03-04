public class Main {
    public static void main(String[] args) {
        Board board = new Board();

// Add the white pieces
        board.addPiece(new Rook("White", new Position("a", 1)));
        board.addPiece(new Knight("White", new Position("b", 1)));
        board.addPiece(new Bishop("White", new Position("c", 1)));
        board.addPiece(new Queen("White", new Position("d", 1)));
        board.addPiece(new King("White", new Position("e", 1)));
        board.addPiece(new Bishop("White", new Position("f", 1)));
        board.addPiece(new Knight("White", new Position("g", 1)));
        board.addPiece(new Rook("White", new Position("h", 1)));
        board.addPiece(new Pawn("White", new Position("a", 2)));
        board.addPiece(new Pawn("White", new Position("b", 2)));
        board.addPiece(new Pawn("White", new Position("c", 2)));
        board.addPiece(new Pawn("White", new Position("d", 2)));
        board.addPiece(new Pawn("White", new Position("e", 2)));
        board.addPiece(new Pawn("White", new Position("f", 2)));
        board.addPiece(new Pawn("White", new Position("g", 2)));
        board.addPiece(new Pawn("White", new Position("h", 2)));

// Add the black pieces

        board.addPiece(new Rook("Black", new Position("a", 8)));
        board.addPiece(new Knight("Black", new Position("b", 8)));
        board.addPiece(new Bishop("Black", new Position("c", 8)));
        board.addPiece(new Queen("Black", new Position("d", 8)));
        board.addPiece(new King("Black", new Position("e", 8)));
        board.addPiece(new Bishop("Black", new Position("f", 8)));
        board.addPiece(new Knight("Black", new Position("g", 8)));
        board.addPiece(new Rook("Black", new Position("h", 8)));
        board.addPiece(new Pawn("Black", new Position("a", 7)));
        board.addPiece(new Pawn("Black", new Position("b", 7)));
        board.addPiece(new Pawn("Black", new Position("c", 7)));
        board.addPiece(new Pawn("Black", new Position("d", 7)));
        board.addPiece(new Pawn("Black", new Position("e", 7)));
        board.addPiece(new Pawn("Black", new Position("f", 7)));
        board.addPiece(new Pawn("Black", new Position("g", 7)));
        board.addPiece(new Pawn("Black", new Position("h", 7)));

// Print the board
        board.printBoard();
    }
}