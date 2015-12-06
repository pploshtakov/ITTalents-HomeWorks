import java.util.Scanner;

public class Task17 {
	/*
	 * Задача 17: Една редица от естествени числа ще наричаме зигзагообразна
	 * нагоре, ако за елементите и са изпълняват условията: N1 < N2 > N3 < N4 >
	 * N5 <.. Съставете програма, която проверява дали въведени в едномерен
	 * масив редица от числа изпълняват горните изисквания.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масива.");
			l = sc.nextInt();
		} while (l <= 0);
		int[] arr = new int[l];
		boolean naz = true;
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
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] || i != 1 && arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
				naz = true;
			} else {
				naz = false;
				break;
			}
		}
		if (naz == true) {
			System.out.println("Изпълнява изискванията за зигзагообразна нагоре редица.");
		} else {
			System.out.println("Не изпълнява изискванията за зигзагообразна нагоре редица.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
