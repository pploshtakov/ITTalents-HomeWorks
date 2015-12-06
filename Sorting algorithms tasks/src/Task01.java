import java.util.Arrays;

public class Task01 {
	/*
	 * Задача 1:
	 * 
	 * Да се състави програма, която сортира по метода на мехурчето
	 * 
	 * предварително въведен двумерен масив с естествени числа.
	 * 
	 * Сортирането да се извърши по редове/колони.
	 * 
	 * Пример:
	 * 
	 * 15; 16; 8; 1;
	 * 
	 * 2; 3; 4; 7;
	 * 
	 * 9; 11; 19; 6;
	 * 
	 * Изход:
	 * 
	 * 1; 2; 3; 4;
	 * 
	 * 6; 7; 8; 9;
	 * 
	 * 11; 15; 16; 19;
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 55, 12, 87, 11 }, { 41, 2, 9, 5 }, { 86, 25, 34, 7 }, { 44, 3, 15, 75 } };
		bubbleSortMatrix(matrix);
		printMatrix(matrix);

		// TODO Auto-generated method stub

	}

	static void bubbleSortMatrix(int[][] m) {
		for (int i = 0; i < m.length * m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				for (int k = 0; k < m[j].length - 1; k++) {
					if (j != 0 && k == 0 && m[j][k] < m[j - 1][m[j].length - 1]) {
						int temp = m[j][k];
						m[j][k] = m[j - 1][m[j].length - 1];
						m[j - 1][m[j].length - 1] = temp;
					}
					if (m[j][k] > m[j][k + 1]) {
						int temp = m[j][k];
						m[j][k] = m[j][k + 1];
						m[j][k + 1] = temp;
					}
				}
			}
		}
	}

	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			for (int j = 0; j < m[i].length; j++) {
				if (j == 0) {
					System.out.print("[" + m[i][j] + ",");
				} else if (j == m[i].length - 1) {
					System.out.print(m[i][j] + "]");
				} else {
					System.out.print(m[i][j] + ",");
				}
			}
		}
	}
}
