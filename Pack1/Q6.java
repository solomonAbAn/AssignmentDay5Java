package Pack1;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[][] squareMatrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int product = calculateMainDiagonalProduct(squareMatrix);

	        System.out.println("Product of the main diagonal elements: " + product);
	    }

	    // Function to calculate the product of the main diagonal elements in a square matrix
	    public static int calculateMainDiagonalProduct(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        if (rows != cols) {
	            throw new IllegalArgumentException("Input matrix is not square.");
	        }

	        int product = 1;

	        for (int i = 0; i < rows; i++) {
	            product *= matrix[i][i];
	        }

	        return product;
	}

}
