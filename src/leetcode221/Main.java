package leetcode221;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char[][] matrix = {{'1','1','1','1','1'}, {'1','1','1','1','1'}, {'1','1','1','1','1'} , {'1','1','1','1','1'}};
		
		System.out.println("Matrix: " + Arrays.deepToString(matrix));
		
		FindLargestAreaFunction solution = new FindLargestAreaFunction();
		
		System.out.println("Solution: " + solution.maximalSquare(matrix));
	}
}
