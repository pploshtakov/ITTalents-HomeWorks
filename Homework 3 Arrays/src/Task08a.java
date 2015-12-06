import java.util.Scanner;

public class Task08a {
	/*
	 * Задача 8: Напишете програма, която намира и извежда най-дългата редица от
	 * еднакви поредни елементи в даден масив.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масивa.");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
		int count = 1;
		int counter = 0;
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност на масива.");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				continue;
			} else if (arr[i] == arr[i - 1]) {
				count++;
				if (count > counter) {
					counter = count;
					number = arr[i];
				}
			} else {
				count = 1;
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
		if (counter == 0) {
			System.out.println("В масива няма два еднакви поредни елемента.");
		} else {
			System.out.print("Най-дълга редица еднакви елементи - ");
			for (int i = 1; i < counter; i++) {
				System.out.print(number + ",");
				if (i == counter - 1) {
					System.out.print(number);
				}
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
