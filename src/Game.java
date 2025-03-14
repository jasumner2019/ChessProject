public class Game {
    //There need to be turns between the two players, white and black
    //While it's white's turn, only the white pieces can be selected. Vice versa for black.
    //each player can only move one piece per turn
    //if a player tries to make an illegal move, the system should give him a chance to pick again
    //There needs to be a check for check
    //there needs to be a check for checkmate
    //any player can quit and terminate the game by pressing q
    //
    private boolean player = true;
    private boolean winCheck = false;

    public void gameMode() {
        gameSetup();

    }
    public void gameSetup() {
        Board board = new Board();

        //Add the white pieces

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

    public boolean checkCheck() {
        //Checking if the current player's king is in an attack square for any opposing piece
    }

}
