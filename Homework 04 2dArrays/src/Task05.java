public class Task05 {
	/*
	 * Задача 5: Да се състави програма, при която предварително са въведени
	 * естествени числа в двумерен масив 4*4 елемента. Програмата да извежда
	 * резултат от проверката какво е съотношението на най-голямата сума по
	 * редове спрямо най-голямата сума по колони.
	 */
	public static void main(String[] args) {
		int[][] matrix = { { -51, 55, 95, 74 }, { 84, 32, 10, 15 }, { 82, 99, 24, 38 }, { 90, 73, 61, 18 } };
		int maxSumRow = 0;
		int maxSumColumn = 0;
		System.out.println("Въведен двумерен масив:");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			int sumrow = 0;
			int sumcolumn = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
					sumrow += matrix[i][j];
					sumcolumn += matrix[j][i];
				} else {
					System.out.print(matrix[i][j] + ",");
					sumrow += matrix[i][j];
					sumcolumn += matrix[j][i];
				}
			}
			if (sumrow > maxSumRow || i == 0) {
				maxSumRow = sumrow;
			}
			if (sumcolumn > maxSumColumn || i == 0) {
				maxSumColumn = sumcolumn;
			}
		}
		System.out.println();
		System.out.println("Максимална сума редове = " + maxSumRow);
		System.out.println("Максимална сума колони = " + maxSumColumn);
		if (maxSumRow > maxSumColumn) {
			System.out.println("Максималната сума по редове > Максимална сума по колони.");
		} else if (maxSumRow < maxSumColumn) {
			System.out.println("Максималната сума по редове < Максимална сума по колони.");
		} else {
			System.out.println("Максималната сума по редове = Максимална сума по колони.");
		}

		// TODO Auto-generated method stub

	}

}
