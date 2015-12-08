public class Task03 {
	/*
	 * Задача 3: Имате двумерен масив от числа, чийто стойности са въведени
	 * предварително. Да се отпечатат сумата на елементите на масива, както и
	 * средноаритметичното на тези числа.
	 */

	public static void main(String[] args) {
		int[][] matrix = { { 51, 55, 95, 74 }, { 84, 32, 10, 15 }, { 82, 99, 24, 38 }, { 90, 73, 61, 18 } };
		int sum = 0;
		int art = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				art = sum / (matrix.length * matrix[i].length);

			}
		}
		System.out.println("Въведен двумерен масив:");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int g = 0; g < matrix[i].length; g++) {
				if (g == matrix[i].length - 1) {
					System.out.print(matrix[i][g]);
				} else {
					System.out.print(matrix[i][g] + ",");
				}
			}
		}
		System.out.println();
		System.out.println("Сума на елементите = " + sum);
		System.out.println("Средно аритметично = " + art);
		// TODO Auto-generated method stub

	}

}
