class Solution {
    public int numIslands(char[][] grid) {
     if (grid == null || grid.length == 0) return 0;

    int rows = grid.length;
    int cols = grid[0].length;
    int islands = 0;
    int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; // Right, Down, Left, Up

    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        if (grid[r][c] == '1') { // Found an island
          islands++;
          bfs(grid, r, c, directions);
        }
      }
    }
    return islands;
  }

  private void bfs(char[][] grid, int r, int c, int[][] directions) {
    int rows = grid.length;
    int cols = grid[0].length;
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {r, c});
    grid[r][c] = '0'; // Mark as visited

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int row = current[0];
      int col = current[1];

      for (int[] dir : directions) {
        int newRow = row + dir[0];
        int newCol = col + dir[1];

        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') {
          queue.offer(new int[] {newRow, newCol});
          grid[newRow][newCol] = '0'; // Mark as visited
        }
      }
    }
  }
}