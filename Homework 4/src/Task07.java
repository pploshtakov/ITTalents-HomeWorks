
public class Task07 {
	/*
	 * Задача 7: Имате предварително въведени стойности от естествени числа,
	 * въведени в квадратна таблица с размери 6 реда и 6 колони. Да се състави
	 * програма , чрез която се намира сумата на всички елементи, чиято сума на
	 * индекси за ред и колона е четно число. Програмата да извежда формираните
	 * суми за всеки отделен ред на квадратната таблица, както и общата сума от
	 * тези елементи. Да се използва само един цикъл.
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 51, 55, 95, 74, 21, 66 }, { 84, 32, 10, 15, 74, 13 }, { 82, 99, 24, 38, 82, 16 },
				{ 90, 73, 61, 18, 88, 63 }, { 22, 94, 56, 74, 37, 44 }, { 11, 82, 95, 73, 54, 48 } };
		int maxSum = 0;
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
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if ((i + j) % 2 == 0) {
					sum += matrix[i][j];
					maxSum += matrix[i][j];
					if (i % 2 == 0 && j == matrix[i].length - 2 || i % 2 != 0 && j == matrix[i].length - 1) {
						System.out.print(matrix[i][j] + " сума от елементите на реда = " + sum);
					} else {
						System.out.print(matrix[i][j] + ",");
					}
				}
			}
			System.out.println();
		}
		System.out.println("Сума на всичките елементи = " + maxSum);
		// TODO Auto-generated method stub

	}

}
