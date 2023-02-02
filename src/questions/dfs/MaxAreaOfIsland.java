package questions.dfs;

public class MaxAreaOfIsland {
    public static int maxAreaOfIsland(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int area = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    area = Math.max(dfs(grid,i,j), area);
                }
            }
        }
        return area;
    }

    private static int dfs(char[][] grid, int i, int j){
        if(i<0 || j>= grid[0].length || j<0 || i>= grid.length || grid[i][j] =='0'){
            return 0;
        }
        grid[i][j] = '0';
        int area = 1;
        area = area + dfs(grid, i-1, j) + dfs(grid, i+1, j) + dfs(grid, i, j-1) + dfs(grid, i, j+1);
        return area;
    }
}
