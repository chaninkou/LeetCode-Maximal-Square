package leetcode221;

public class FindLargestAreaFunction {
	// O(m * n) time and O(m * n) space
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;
        
        int[][] dp = new int[m + 1][n + 1];
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
            	// - 1 since i and j starts from 1
                if(matrix[i - 1][j - 1] == '1'){
                	// Check the top left, top right, then check the bottom left, min will make sure to get any 0
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                    
                    // Get the max area
                    result = Math.max(result, dp[i][j]);
                }    
            }
        }
        
        return result * result;
    }
}
