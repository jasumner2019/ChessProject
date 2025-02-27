public record Position(String file, int rank) {
    public Position {
        // Validate file
        if (file == null || file.length() != 1 || file.charAt(0) < 'a' || file.charAt(0) > 'h') {
            throw new IllegalArgumentException("File must be a single letter from 'a' to 'h'");
        }

        // Validate rank
        if (rank < 1 || rank > 8) {
            throw new IllegalArgumentException("Rank must be between 1 and 8");
        }
    }

    // Optional: Method to get the position in chess notation
    public String toChessNotation() {
        return file + rank;
    }
}
