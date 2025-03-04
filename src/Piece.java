abstract class Piece {
    private final String type;
    private final String color;
    private Position position;
    private String symbol;

    public Piece(String type, String color, Position position, String symbol) {
        this.type = type;
        this.color = color;
        this.position = position;
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getSymbol() {
        return symbol;
    }

    // New abstract method for checking valid moves
    public abstract boolean isValidMove(Position newPosition, Board board);

    // Helper method to check if a position is within the board
    protected boolean isWithinBoard(Position position) {
        return position.getFile() >= 'a' && position.getFile() <= 'h' &&
                position.getRank() >= 1 && position.getRank() <= 8;
    }
}


