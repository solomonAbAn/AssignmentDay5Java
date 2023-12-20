package Pack1;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = {
		            {5, 12, 9, 15},
		            {7, 15, 4, 10},
		            {8, 3, 10, 6}
		        };

		        int[] secondLargestElements = findSecondLargestInEachRow(matrix);

		        System.out.println("Second largest element in each row:");
		        for (int i = 0; i < secondLargestElements.length; i++) {
		            System.out.println("Row " + (i + 1) + ": " + secondLargestElements[i]);
		        }
		    }

		    // Function to find the second-largest element in each row of a matrix
		    public static int[] findSecondLargestInEachRow(int[][] matrix) {
		        int rows = matrix.length;
		        int cols = matrix[0].length;

		        int[] secondLargestElements = new int[rows];

		        for (int i = 0; i < rows; i++) {
		            int largest = Integer.MIN_VALUE;
		            int secondLargest = Integer.MIN_VALUE;

		            for (int j = 0; j < cols; j++) {
		                if (matrix[i][j] > largest) {
		                    secondLargest = largest;
		                    largest = matrix[i][j];
		                } else if (matrix[i][j] > secondLargest && matrix[i][j] != largest) {
		                    secondLargest = matrix[i][j];
		                }
		            }

		            secondLargestElements[i] = secondLargest;
		        }

		        return secondLargestElements;
	}

}
