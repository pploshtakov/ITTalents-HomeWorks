
public class Task08 {
	/*
	 * 8. Напишете програма, която за матрица от булеви стойности, проверява
	 * дали се съдържа елемент със стойност true над втория диагонал.
	 */
	public static void main(String[] args) {
		boolean[][] matrix = { { false, false, false, true }, { false, false, false, false },
				{ false, true, false, false }, { true, true, true, true } };
		boolean trueorfalse = false;
		out: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length - (i + 1); j++) {
				if (matrix[i][j] == true) {
					trueorfalse = true;
					System.out.println("True");
					break out;
				}
			}
		}
		if (trueorfalse == false) {
			System.out.println("False");

		}

		// TODO Auto-generated method stub

	}

}
