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

    //print a blank board
    public void printBoardBlank() {
        System.out.println("  " + "-".repeat(25));
        System.out.println("8 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("7 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("6 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("5 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("4 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("3 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("2 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("1 " + "|  ".repeat(9));
        System.out.println("  " + "-".repeat(25));
        System.out.println("   A  B  C  D  E  F  G  H");
    }

    //print a board with all the pieces
}
