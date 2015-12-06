import java.util.Scanner;

public class Task13 {
	/*
	 * Задача 13: Да се състави програма, чрез която се въвежда число и се
	 * представя като число в двоична бройна система. Програмата, чрез масив, да
	 * изчислява последователно всички цифри на въведеното естествено число в
	 * 2-ична бройна система.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Въведете число.");
			System.out.println("min - -2147483646; max - 2147483647");
			number = sc.nextInt();
		} while (number < -2147483646 || number > 2147483647);
		int[] arr = new int[33];
		System.out.println("Въведено число - " + number);
		for (int i = 0; i < arr.length; i++) {
			if (number < 0) {
				number = number * -1;
				arr[0] = 1;
			}
			arr[arr.length - (i + 1)] = number % 2;
			number /= 2;
			if (number / 2 == 0) {
				arr[arr.length - (i + 2)] = number % 2;
				break;
			}
		}
		System.out.print("Въведеното число в двоична бройна с-ма. - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		sc.close();

		// TODO Auto-generated method stub

	}

}
