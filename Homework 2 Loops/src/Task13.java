import java.util.Scanner;

public class Task13 {
	/*
	 * Задача 13: Да се състави програма, която извежда всички естествени
	 * трицифрени числа, които имат сбор на цифрите равен на дадено число.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		do {
			System.out.println("Въведете N (2<=N<=27)");
			sum = sc.nextInt();
		} while (sum < 2 || sum > 27);
		System.out.println(sum);
		for (int x = 100; x <= 999; x++) {
			int a = x / 100;
			int a1 = x % 100;
			int b = a1 / 10;
			int c = x % 10;
			if (a + b + c == sum) {
				System.out.print(a * 100 + b * 10 + c + ",");
			}
		}
		sc.close();

		// TODO Auto-generated method stub

	}

}
