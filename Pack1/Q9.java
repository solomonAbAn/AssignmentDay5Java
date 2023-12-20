package Pack1;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrix2 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        boolean areEqual = areMatricesEqual(matrix1, matrix2);

	        if (areEqual) {
	            System.out.println("Matrices are equal.");
	        } else {
	            System.out.println("Matrices are not equal.");
	        }
	    }

	    // Function to check if two matrices are equal
	    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
	        int rows1 = matrix1.length;
	        int cols1 = matrix1[0].length;
	        int rows2 = matrix2.length;
	        int cols2 = matrix2[0].length;

	        if (rows1 != rows2 || cols1 != cols2) {
	            return false;
	        }

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols1; j++) {
	                if (matrix1[i][j] != matrix2[i][j]) {
	                    return false;
	                }
	            }
	        }

	        return true;
	}

}
