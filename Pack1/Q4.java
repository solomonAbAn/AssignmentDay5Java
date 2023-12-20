package Pack1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = {
		            {5, 12, 9},
		            {7, 15, 4},
		            {8, 3, 10}
		        };

		        int largestElement = findLargestElement(matrix);

		        System.out.println("Largest element in the matrix: " + largestElement);
		    }

		    // Function to find the largest element in a matrix
		    public static int findLargestElement(int[][] matrix) {
		        int largestElement = matrix[0][0];

		        for (int[] row : matrix) {
		            for (int element : row) {
		                if (element > largestElement) {
		                    largestElement = element;
		                }
		            }
		        }

		        return largestElement;
	}

}
