package Pack1;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        double[] columnAverages = calculateColumnAverages(matrix);

	        System.out.println("Average of each column:");
	        for (int i = 0; i < columnAverages.length; i++) {
	            System.out.println("Column " + (i + 1) + ": " + columnAverages[i]);
	        }
	    }

	    // Function to calculate the average of each column in a matrix
	    public static double[] calculateColumnAverages(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        double[] columnSums = new double[cols];
	        double[] columnAverages = new double[cols];

	        for (int j = 0; j < cols; j++) {
	            for (int i = 0; i < rows; i++) {
	                columnSums[j] += matrix[i][j];
	            }
	            columnAverages[j] = columnSums[j] / rows;
	        }

	        return columnAverages;
	}

}
