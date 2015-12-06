
public class Task04 {
	/*
	 * Задача 4: Имате предварително въведени стойности на елементи в двумерен
	 * масив - естествени числа. Да се състави програма, чрез която се извеждат
	 * стойностите на елементите в двумерен масив след обръщането му на +90
	 * градуса.
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 51, 55, 95, 74, 21, 66 }, { 84, 32, 10, 15, 74, 13 }, { 82, 99, 24, 38, 82, 16 },
				{ 90, 73, 61, 18, 88, 63 }, { 22, 94, 56, 74, 37, 44 }, { 11, 82, 95, 73, 54, 48 } };
		System.out.println("Въведен двумерен масив:");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[j].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
		}
		System.out.println();
		System.out.println("Въведен масив +90 градуса.");
		for (int j = 0; j < matrix.length; j++) {
			System.out.println();
			for (int i = matrix.length - 1; i >= 0; i--) {
				if (i == 0) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
