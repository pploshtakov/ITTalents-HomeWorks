import java.util.Scanner;

public class Task12 {
	/*
	 * Задача 12: Да се създаде метод, който приема за входни данни число N и
	 * връща масив от числа с дължина N, който съдържа всички числа от 1 до N.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.");
		int n = sc.nextInt();
		System.out.println("Създаден масив с числа от 1 до N.");
		printArray(createArray1toN(n));
		sc.close();

		// TODO Auto-generated method stub

	}

	static int[] createArray1toN(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
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
}
