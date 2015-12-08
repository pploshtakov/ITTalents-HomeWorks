import java.util.Scanner;

public class Task16 {
	/*
	 * Задача 16: Да се състави програма, чрез която се въвеждат 2 естествени
	 * числа N, M от интервала [10..5555]. Програмата, чрез цикъл for, да
	 * извежда всички числа от интервала, които са кратни на 50 в низходящ ред.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.println("Въведете N (10<=N<=5555)");
			n = sc.nextInt();
			System.out.println("Въведете M (10<=M<=5555)");
			m = sc.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555);
		if (n > m) {
			int x = n;
			n = m;
			m = x;
		}
		for (; m >= n; m--) {
			if (m % 50 == 0) {
				System.out.print(m + ",");
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}