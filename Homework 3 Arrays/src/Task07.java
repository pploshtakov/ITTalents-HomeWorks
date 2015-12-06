import java.util.Scanner;

public class Task07 {
	/*
	 * Задача 7: Напишете програма, която първо чете масив и после създава нов
	 * масив със същия размер по следния начин: стойността на всеки елемент от
	 * втория масив да е равна на сбора от предходния и следващият елемент на
	 * съответния елемент от първия масив. Първият и последният елемент на
	 * втория масив трябва да си останат равни на първият и последният от
	 * елемент от първия масив. Да се изведе получения масив.
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
		int[] arr1 = new int[l];
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0 || i == arr1.length - 1) {
				arr1[i] = arr[i];
			} else {
				arr1[i] = arr[i - 1] + arr[i + 1];
			}
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
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("Нов масив - [" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
