
public class Task09 {
	/*
	 * 9. Дадена е правоъ­гълна матрица с числа. Да се намери в нея максималната
	 * подмат­рица с размер 2 х 2 и да се отпечата на конзолата. Под максимална
	 * подматрица се разбира подматрица, която има максимална сума на
	 * елементите, които я съставят.
	 */
	public static void main(String[] args) {
		int[][] matrix = {
				{10,11,10,94,10,12},
				{47,15,28,15,11,15},
				{47,11,15,17,13,38},
				{17,54,42,74,24,31},
				{12,15,17,19,13,22}
		};
		int maxSum = 0;
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < matrix.length - 1;i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				if (i == 0 && j == 0) {
					maxSum = matrix[i][j] + matrix[i][j + 1] + matrix [i + 1][j] + matrix [i + 1][j + 1];
					maxI = i;
					maxJ = j;
				} else if (maxSum < matrix[i][j] + matrix[i][j + 1] + matrix [i + 1][j] + matrix [i + 1][j + 1] ) {
					maxSum = matrix[i][j] + matrix[i][j + 1] + matrix [i + 1][j] + matrix [i + 1][j + 1];
					maxI = i;
					maxJ = j;
				}
			}
		}
		System.out.println(matrix[maxI][maxJ] + "," + matrix[maxI][maxJ + 1]);
		System.out.println(matrix[maxI + 1][maxJ] + "," + matrix[maxI + 1][maxJ + 1]);

		
		
		// TODO Auto-generated method stub

	}

}
