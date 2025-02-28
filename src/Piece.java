abstract class Piece {
    private final String type;
    private final String color;
    private Position position;

    public Piece(String type, String color, Position position) {
        this.type = type;
        this.color = color;
        this.position = position;
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
}


