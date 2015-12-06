import java.util.Scanner;

public class Task02 {
	/*
	 * Задача 2: Да се състави програма, която изчислява произведение на две
	 * естествени числа =>2, като се използва само събиране. Входни данни: 2
	 * естествени числа.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.(N >= 2)");
		int n = sc.nextInt();
		n = validNumber(n , sc);
		System.out.println("Въведете М.(М >= 2)");
		int m = sc.nextInt();
		m = validNumber(m , sc);
		int mul;
		if (n > m) {
			mul = calcMul(n , m);
		} else {
			mul = calcMul(m , n);
		}
		System.out.println(n + " * " + m + " = " + mul);
	}

	static int validNumber(int n, Scanner sc) {
		while (n < 2) {
			System.out.println("Повторете числото!(N,M >= 2)");
			n = sc.nextInt();
		}
		return n;
	}
	static int calcMul(int n, int m) {
		int mul;
		if (m == 1) {
			return n;
		}
		mul = n + calcMul(n , m - 1);
		return mul;
	}
}
