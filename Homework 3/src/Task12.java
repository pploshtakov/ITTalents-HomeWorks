import java.util.Scanner;

public class Task12 {
	/*
	 * Задача 12: Да се състави програма, чрез която по предварително въведени 7
	 * числа в едномерен масив се разменят местата на елементи с индекси: - 0 и
	 * 1 чрез трета променлива; - 2 и 3 чрез събиране; - 4 и 5 чрез умножение.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
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
		int x = arr[0];
		arr[0] = arr[1];
		arr[1] = x;

		int sum = arr[2] + arr[3];
		arr[3] = sum - arr[3];
		arr[2] = sum - arr[2];

		int mul = arr[4] * arr[5];
		arr[5] = mul / arr[5];
		arr[4] = mul / arr[4];
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
