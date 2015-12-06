import java.util.Scanner;

public class Task10 {
	/*
	 * Да се напише програма която изисква от потребителя да въведе 2 числа n и
	 * m. След това да се построи матрица с размер n x m по следният начин
	 * (примерите са дадени за въведени n=4 и m=5):
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.(N > 0)");
		int n = sc.nextInt();
		n = validNumber(n, sc);
		System.out.println("Въведете М.(M > 0)");
		int m = sc.nextInt();
		m = validNumber(m, sc);
		int[][] matrix = new int[n][m];
		int count = n * m;
		int count1 = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (count1 <= count) {
					matrix[i][j] = count1;
					count1++;
				}
			}
		}
		printMatrix(matrix);
		System.out.println();
		count1 = 1;
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (count1 <= count) {
					matrix[j][i] = count1;
					count1++;
				}
			}
		}
		printMatrix(matrix);
		System.out.println();
		count1 = 1;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < matrix.length; j++) {
					if (count1 <= count) {
						matrix[j][i] = count1;
						count1++;
					}
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					if (count1 <= count) {
						matrix[j][i] = count1;
						count1++;
					}
				}
			}
		}
		printMatrix(matrix);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	static int validNumber(int n, Scanner sc) {
		while (n < 1) {
			System.out.println("Повторете числото!");
			n = sc.nextInt();
		}
		return n;
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[i].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
		}
	}
}
