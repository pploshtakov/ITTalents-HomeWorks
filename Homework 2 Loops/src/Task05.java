import java.util.Scanner;

public class Task05 {
	/*
	 * Задача 5: Да се въведат от потребителя 2 числа. И да се изведат на екрана
	 * всички числа от по-малкото до по-голямото.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първото число.");
		int a = sc.nextInt();
		System.out.println("Въведете второто число.");
		int b = sc.nextInt();
		if (a > b) {
			int x;
			x = a;
			a = b;
			b = x;
		}
		for (; a <= b; a++) {
			System.out.print(a + " ");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
