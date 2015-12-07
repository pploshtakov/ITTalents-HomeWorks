import java.util.Scanner;

public class Task01 {
	/*
	 * Задача 1: Да се състави програма, която изчислява N-тото число на
	 * Фибоначи. Първото и второто число на Фибоначи са 1-ци, всяко следващо е
	 * равно на сбора на предходните 2.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.(N >= 1)");
		int n = sc.nextInt();
		n = validNumber(n, sc);
		System.out.println("Фибоначи " + n + " = " + calcFibonaci(n));

		// TODO Auto-generated method stub

	}

	static int validNumber(int n, Scanner sc) {
		while (n < 1) {
			System.out.println("Въведете N.(N >= 0");
			n = sc.nextInt();
		}
		return n;
	}

	static int calcFibonaci(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			n = calcFibonaci(n - 1) + calcFibonaci(n - 2);
		}
		return n;
	}
}