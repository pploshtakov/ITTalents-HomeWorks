public class Task11 {
	/*
	 * Задача 11: Да се създаде метод, който отпечатва масив в конзолата.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
		System.out.println("Print array:");
		printArray(arr);
		int[][] matrix = { { 1, 3, 5 }, { 7, 9, 2 }, { 4, 6, 8 } };
		System.out.println();
		System.out.println("Print matrix:");
		printMatrix(matrix);
		// TODO Auto-generated method stub

	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			printArray(matrix[i]);
		}
	}
}
