class Solution {

    public boolean isPossible(char[][] board, int col, int row, List<List<String>> ans) {
        //CHECK VERTICALLY
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //CHECK LEFT UPPER DIAGONAL
        for (int i = row, j = col; (i >= 0 && j >= 0); i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //CHECK RIGHT UPPER DIAGONAL
        for (int i = row, j = col; (j < board.length && i >= 0); i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void helperQueen(char[][] board, List<List<String>> ans, int row, int totalNoOfQueen){
        if (totalNoOfQueen == row) {
            List<String> temp = new ArrayList<>();
            for (char[] arr : board) {
                temp.add(new String(arr));
            }
            ans.add(temp);
            return;
        }
        for (int i =0; i < totalNoOfQueen; i++) {
            if (isPossible(board, i, row, ans )) {
                board[row][i] = 'Q'; //MARK
                helperQueen(board, ans, row+1, totalNoOfQueen);//RECALL
                board[row][i] = '.'; //UNMARK
            }
        }
    }
   
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n]; //create a board of nxn
        for (int i = 0; i < n; i++) {
            for (int j =0; j < n; j++) {
                board[i][j] = '.'; // Mark every square with '.' initially.
            }
        }
        helperQueen(board, ans, 0, n);
        return ans;
        
    }
}