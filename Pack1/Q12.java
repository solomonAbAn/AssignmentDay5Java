package Pack1;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int rowIndex = findMaxSumRow(matrix);

	        System.out.println("Row with the maximum sum: " + (rowIndex + 1));
	    }

	    // Function to find the row with the maximum sum in a matrix
	    public static int findMaxSumRow(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int maxSumRow = 0;
	        int maxSum = Integer.MIN_VALUE;

	        for (int i = 0; i < rows; i++) {
	            int rowSum = 0;

	            for (int j = 0; j < cols; j++) {
	                rowSum += matrix[i][j];
	            }

	            if (rowSum > maxSum) {
	                maxSum = rowSum;
	                maxSumRow = i;
	            }
	        }

	        return maxSumRow;
	}

}
