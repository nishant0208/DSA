class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;

        Deque<int[]> queue = new ArrayDeque<>();
        int[][] directs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        int count = 0;
        queue.addLast(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int[] curPos = queue.pollFirst();
                for (int[] direct : directs) {
                    int nr = curPos[0] + direct[0];
                    int nc = curPos[1] + direct[1];

                    if (nr < 0 || nr >= n || nc < 0 || nc >= m)
                        continue;
                    else if (maze[nr][nc] == '+')
                        continue;
                    else if (nr == 0 || nr == n - 1 || nc == 0 || nc == m - 1)
                        return count + 1;
                    else {
                        maze[nr][nc] = '+';
                        queue.addLast(new int[]{nr, nc});
                    }
                }
            }
            count++;
        }
        return -1;
    }
}