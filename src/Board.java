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

    public printBoard() {
        System.out.println("H " + "|  ".repeat(8) )
        System.out.println("G " + "|  ".repeat(8))
        System.out.println("F " + "|  ".repeat(8))
        System.out.println("E " + "|  ".repeat(8))
        System.out.println("D " + "|  ".repeat(8))
        System.out.println("C " + "|  ".repeat(8))
        System.out.println("B " + "|  ".repeat(8))
        System.out.println("A " + "|  ".repeat(8))
        System.out.println("**" + "|  ".repeat(8))
    }
}
