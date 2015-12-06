import java.util.Scanner;

public class Task10 {
	/*
	 * Задача 10: Въведете число от клавиатурата и определете дали е просто.
	 * Просто число е това което се дели САМО на 1 и на себе си.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число.");
		int n = sc.nextInt();
		int x;
		boolean isPrime = true;
		for (x = 2; x < n; x++) {
			if (n % x == 0) {
				System.out.println("Числото не е просто.");
				isPrime = false;
				break;
			}
		}
		if (isPrime != false) {
			System.out.println("Числото е просто.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
