package Pack1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int sum = calculateSum(matrix);

	        System.out.println("Sum of all elements: " + sum);
	    }

	    // Function to calculate the sum of all elements in a matrix
	    public static int calculateSum(int[][] matrix) {
	        int sum = 0;

	        for (int[] row : matrix) {
	            for (int element : row) {
	                sum += element;
	            }
	        }

	        return sum;
	}

}
