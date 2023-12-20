package Pack1;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int elementToFind = 5;

	        int frequency = findElementFrequency(matrix, elementToFind);

	        System.out.println("Frequency of " + elementToFind + " in the matrix: " + frequency);
	    }

	    // Function to find the frequency of a given element in a 2D array
	    public static int findElementFrequency(int[][] matrix, int element) {
	        int frequency = 0;

	        for (int[] row : matrix) {
	            for (int value : row) {
	                if (value == element) {
	                    frequency++;
	                }
	            }
	        }

	        return frequency;
	}

}
