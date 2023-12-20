package Pack1;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[] rowSums = calculateRowSums(matrix);

	        System.out.println("Sum of each row:");
	        System.out.println(Arrays.toString(rowSums));
	    }

	    // Function to calculate the sum of each row in a matrix
	    public static int[] calculateRowSums(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int[] rowSums = new int[rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                rowSums[i] += matrix[i][j];
	            }
	        }

	        return rowSums;
	}

}
