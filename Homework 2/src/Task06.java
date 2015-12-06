import java.util.Scanner;

public class Task06 {
	/*
	 * Задача 6: Да се прочете число от екрана(конзолата) и да се изведе сбора
	 * на всички числа между 1 и въведеното число.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число.");
		int number = sc.nextInt();
		int x = 1;
		for (int y = 2; y <= number; y++) {
			x = x + y;
		}
		System.out.println("Sum = " + x);
		sc.close();
		// TODO Auto-generated method stub

	}

}
