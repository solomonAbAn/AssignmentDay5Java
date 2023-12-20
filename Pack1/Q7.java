package Pack1;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int[][] result = addMatrices(matrix1, matrix2);

	        System.out.println("Resultant Matrix after addition:");
	        displayMatrix(result);
	    }

	    // Function to add two matrices
	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;

	        if (rows != matrix2.length || cols != matrix2[0].length) {
	            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
	        }

	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return result;
	    }

	    // Function to display a matrix
	    public static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	}

}
