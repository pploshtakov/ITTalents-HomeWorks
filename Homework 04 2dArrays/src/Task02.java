import java.util.Scanner;

public class Task02 {
	/*
	 * Задача 2: Имате квадратен двумерен масив от естествени числа, чийто
	 * стойности се въвеждат от конзолата. Да се отпечатат диагоналите на
	 * масива.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int g = 0; g < arr[i].length; g++) {
				if (g == 0) {
					System.out.println("Въведете " + (g + 1) + "-во число на " + (i + 1) + " ред.");
					arr[i][g] = sc.nextInt();
				} else if (g == 1) {
					System.out.println("Въведете " + (g + 1) + "-ро число на " + (i + 1) + " ред.");
					arr[i][g] = sc.nextInt();
				} else {
					System.out.println("Въведете " + (g + 1) + "-то число на " + (i + 1) + " ред.");
					arr[i][g] = sc.nextInt();
				}
			}
		}
		System.out.println("Въведен двумерен масив:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int g = 0; g < arr[i].length; g++) {
				if (g == arr[i].length - 1) {
					System.out.print(arr[i][g]);
				} else {
					System.out.print(arr[i][g] + ",");
				}
			}
		}
		System.out.println();
		System.out.print("Главен диагонал: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
		System.out.println();
		System.out.print("Обратен диагонал: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i + j == arr.length - 1) {
					System.out.print(arr[i][j] + " ");

				}
			}
		}
		sc.close();

		// TODO Auto-generated method stub

	}

}
