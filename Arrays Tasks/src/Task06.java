public class Task06 {
	/*
	 * 6.Напишете програма, която за дадена матрица от символи отпечатва на
	 * екрана елементите, които се намират на главния диагонал. 7.Напишете
	 * програма, която за дадена матрица намира произведението на елементите под
	 * главния диагонал.
	 */

	public static void main(String[] args) {
		int[][] matrix = { { 55, 15, 62, 74, 95 }, { 41, 22, 94, 14, 18 }, { 71, 10, 73, 46, 52 },
				{ 38, 26, 14, 19, 90 }, { 15, 65, 28, 31, 88 } };
		System.out.println("Главен диагонал:");
		for (int i = 0; i < matrix.length; i++) {
			if (i == matrix.length - 1) {
				System.out.print(matrix[i][i]);
			} else {
				System.out.print(matrix[i][i] + ",");
			}
		}
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			/*
			 * for (int j = 0; j < matrix[i].length; j++) { if (j < i) { sum +=
			 * matrix[i][j]; }
			 */
			for (int j = 0; j < i; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println();
		System.out.println("Сума на елементите под главния диагонал = " + sum);

		// TODO Auto-generated method stub

	}

}
