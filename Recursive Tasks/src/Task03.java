import java.util.Scanner;

public class Task03 {
	/*
	 * Задача 3: Да се състави програма, която проверява дали въведено
	 * естествено число е просто.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число.");
		int number = sc.nextInt();
		int[] arr = { 2, 3, 5, 7 };
		int count = 0;
		boolean prime = numberisPrime(arr, count, number);
		if (prime) {
			System.out.println("Въведеното число е просто.");
		} else {
			System.out.println("Въведеното число не е просто.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

	static boolean numberisPrime(int[] arr, int count, int number) {
		boolean prime = true;
		if (number % arr[count] == 0) {
			prime = false;
			return prime;
		} else if (count == arr.length - 1) {
			return prime;
		} else {
			numberisPrime(arr, count + 1, number);
		}
		return prime;
	}
}