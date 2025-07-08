class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        if (grid.length==0 || grid [0].length==0 || grid== null){
            return 0;
        }
        for (int row = 0 ; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                 if (grid[row][col]== '1')
                {
                  dfs(grid, row, col);
                  islands++;
                }
            }
        }
        return islands;
        
    }
    private void dfs (char[][] grid,int i ,int j)
    {
        if (i<0||i>=grid.length||j<0 || j>=grid[0].length || grid[i][j]=='0')
        return;
        grid[i][j]='0';
         dfs(grid,i + 1, j);
         dfs(grid,i - 1, j);
         dfs(grid,i , j + 1);
         dfs(grid,i , j - 1);
    }
}