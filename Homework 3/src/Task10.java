import java.util.Scanner;

public class Task10 {
	/*
	 * Задача 10: Да се състави програма, чрез която се въвеждат 7 цели числа в
	 * едномерен масив. Програмата да изведе числото, което е най-близко до
	 * средната стойност на въведените числа.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int sum = 0;
		int art = 0;
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност на масива.");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		art = sum / arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == art) {
				s = arr[i];
				break;
			} else if (art > arr[i] && art - arr[i] < art - s || i == 0) {
				s = arr[i];
			} else if (art < arr[i]) {
				if (art - s >= 0 && arr[i] - art < art - s || art - s < 0 && arr[i] - art < s - art) {
					s = arr[i];
				}
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
		System.out.println("Средно аритметично = " + art);
		System.out.println("Най - близка стойност = " + s);
		sc.close();
		// TODO Auto-generated method stub

	}

}
