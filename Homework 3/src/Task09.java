import java.util.Scanner;

public class Task09 {
	/*
	 * Задача 9: Напишете програма, в която потребителя въвежда масив, след
	 * което елементите на масива се обръщат в обратен ред (Целта не е масива да
	 * се отпечата в обратен ред, ами първо да се обърне, след което да се
	 * отпечата в нормален ред). Пробвайте да решите задачата първо с един
	 * допълнителен масив и после без да използвате друг масив.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масивa.");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
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
		for (int i = 0; i < arr.length / 2; i++) {
			int x = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = x;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("Нов масив - [" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		sc.close();

		// TODO Auto-generated method stub

	}

}
