class Solution {
    public static int numIslands(char[][] grid) {
        int islandCount = 0;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                     bfs(grid, i, j);
                     islandCount++;
                }
                   
            }
        }
        return islandCount;
        
    }
    
   
    public static void bfs(char[][] grid, int i, int j){
        
        grid[i][j] = '2';

        if(i<grid.length-1 && grid[i+1][j] =='1')
            bfs(grid, i+1, j);
        
        if(j<grid[0].length-1 && grid[i][j+1] =='1')
            bfs(grid, i, j+1);

        if(j>=1 && grid[i][j-1] =='1')
            bfs(grid, i, j-1);
        
        if(i>=1 && grid[i-1][j] =='1')
            bfs(grid, i-1, j);
        
        return;
        
    }

    public static void main(String args[]){
        char grid[][] = new char[][]{
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}

        };
        int numIslands = numIslands(grid);
        System.out.println(numIslands);
    }
}