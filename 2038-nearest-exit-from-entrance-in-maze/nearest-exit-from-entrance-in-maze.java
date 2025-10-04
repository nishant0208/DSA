class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length, m = maze[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        vis[entrance[0]][entrance[1]] = true;
        q.offer(new int[]{0, entrance[0], entrance[1]});  // {steps, row, col}
        
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int steps = cur[0], r = cur[1], c = cur[2];

            if ((r == 0 || c == 0 || r == n-1 || c == m-1)
                && !(r == entrance[0] && c == entrance[1])) {
                return steps;
            }
            
            for (int i = 0; i < 4; i++) {
                int nr = r + dRow[i], nc = c + dCol[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m
                    && !vis[nr][nc] && maze[nr][nc] == '.') {
                    vis[nr][nc] = true;
                    q.offer(new int[]{steps + 1, nr, nc});
                }
            }
        }
        return -1;
    }
}