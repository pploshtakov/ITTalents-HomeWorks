import java.util.Scanner;

public class Task11 {
	/*
	 * Задача 11: Да се състави програма, която въвежда от клавиатурата 7 цели
	 * числа в едномерен масив Програмата да изведе всички числа кратни на 5, но
	 * по големи от 5.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност на масива.");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("Въведен масив - [" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				if (arr[i] != arr.length - 1) {
					System.out.print(arr[i] + ",");
				} else {
					System.out.print(arr[i]);
				}
				count++;
			}
		}
		System.out.println(" - " + count + " числа кратни на 5(>5).");
		sc.close();
		// TODO Auto-generated method stub

	}

}
