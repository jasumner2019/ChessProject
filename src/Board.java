import java.util.HashMap;

public class Board {
    private HashMap<String, Integer> board = new HashMap<>();
    private String columnNames = "ABCDEFGH";
    private String rows = "12345678";

    public Board() {
        // Constructor
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < columnNames.length(); i++) {
            board.put(String.valueOf(columnNames.charAt(i)), Integer.valueOf(String.valueOf(rows.charAt(i))));
        }
    }

    public
}
