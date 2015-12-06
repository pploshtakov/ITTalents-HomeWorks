
public class Task05 {
	/*
	 * Напишете програма, която за дадена матрица m x n от числа намира реда, в
	 * който сумата от елементите е максимална.
	 */
	public static void main(String[] args) {
		int[][] matrix = {
				{25,39,99,10,12},
				{84,12,10,61,18},
				{87,45,95,79,88},
				{11,12,13,14,15}
		};
		calcMaxRow(matrix);
		
		
		// TODO Auto-generated method stub

	}
	static void calcMaxRow(int[][] matrix) {
		int maxSum = 0;
		int maxI = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (i == 0) {
					maxSum = sum;
				}
				if (sum > maxSum) {
					maxSum = sum;
					maxI = i;
				}
			}
		}
		System.out.println("Максимална сума = " + maxSum + " е на " + maxI + " ред.");
	}
}
