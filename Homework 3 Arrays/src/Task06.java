import java.util.Scanner;

public class Task06 {
	/*
	 * Задача 6: Напишете програма, която първо чете 2 масива и после извежда
	 * съобщение дали са еднакви, и дали са с еднакъв размер.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		int l1;
		do {
			System.out.println("Въведете дължина на 1-вия масив.");
			l = sc.nextInt();
		} while (l < 1);
		do {
			System.out.println("Въведете дължина на 2-рия масив.");
			l1 = sc.nextInt();
		} while (l1 < 1);
		int[] arr = new int[l];
		int[] arr1 = new int[l1];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност на 1-вия масив.");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност на 2-рия масив.");
			arr1[i] = sc.nextInt();
		}
		if (l != l1) {
			System.out.println("Масивите не са еднакви и с различна дължина.");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr1[i]) {
					System.out.println("Масивите са с равна дължина, но са различни.");
					break;
				} else {
					if (i == arr.length - 1) {
						System.out.println("Масивите имат еднакви дължини и стойности.");
					}
				}
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}