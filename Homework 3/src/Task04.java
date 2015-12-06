import java.util.Scanner;

public class Task04 {
	/*
	 * Задача 4: Да се прочете масив и да се отпечата дали е огледален.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		boolean mirror = false;
		do {
			System.out.println("Въведете дължина на масива.");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност от масива.");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (l == 1) {
				mirror = true;
			} else if (arr[i] == arr[arr.length - (i + 1)]) {
				mirror = true;
			} else {
				mirror = false;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		if (mirror == true) {
			System.out.println("Масива е огледален.");
		} else {
			System.out.println("Масива не е огледален.");
		}
		sc.close();
	}
}

// TODO Auto-generated method stub
