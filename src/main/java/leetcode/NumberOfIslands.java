package leetcode;

public class NumberOfIslands {
    public static void main(String[] args) {
        int [][] grid={
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(getNumberOfIslands(grid));
    }

    private static int getNumberOfIslands(int[][] grid) {
        int h= grid.length;
        if (h==0)return 0;
        int l=grid[0].length;
        int result =0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                    result++;
                }
            }
        }
        return result;
    }

    private static void dfs(int[][] grid, int i, int j) {
        int H= grid.length;
        int L=grid[0].length;
        if (i<0||j<0||i>=H||j>=L||grid[i][j]!='1')return;
        grid[i][j]='2';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
