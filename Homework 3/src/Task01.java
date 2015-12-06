import java.util.Scanner;
/*Задача 1:
Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.*/

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масива.");
			l = sc.nextInt();
		} while (l < 1);
		int arr[] = new int[l];
		int s = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност от масива.");
			arr[i] = sc.nextInt();
			if (arr[i] % 3 == 0) {
				if (s == 1 || s > arr[i]) {
					s = arr[i];
				}
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
		if (s == 1) {
			System.out.println("В масива няма числа кратни на 3.");
		} else {
			System.out.println("Няй-малкото число кратно на 3 от масива е " + s);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
