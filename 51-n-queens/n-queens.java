class Solution {
    private List<List<String>> results = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        backtrack(0, n, 0, 0, 0, board);
        return results;
    }

    private void backtrack(int row, int n, int cols, int diag1, int diag2, char[][] board) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board)
                solution.add(new String(r));
            results.add(solution);
            return;
        }

        int available = ((1 << n) - 1) & ~(cols | diag1 | diag2);

        while (available != 0) {
            int position = available & -available;
            int col = Integer.bitCount(position - 1);

            board[row][col] = 'Q';

            backtrack(row + 1, n,
                    cols | position,
                    (diag1 | position) << 1,
                    (diag2 | position) >> 1,
                    board);

            board[row][col] = '.';

            available &= available - 1;
        }
    }
}