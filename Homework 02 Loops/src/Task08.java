import java.util.Scanner;

public class Task08 {
	/*
	 * Задача 8: По зададено число n, да се изведе на екрана таблица по следния
	 * начин:
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.");
		int n = sc.nextInt();
		int z = n - 1;
		System.out.println(n);
		if (n > 0) { // При положително N.
			for (int x = 1; x <= n; x++) {
				for (int y = 1; y <= n; y++) {
					System.out.print(z);
				}
				z = z + 2;
				System.out.println();
			}
		} else { // При отрицателно N.
			z = n + 1;
			for (int x = -1; x >= n; x--) {
				for (int y = -1; y >= n; y--) {
					System.out.print(z);
				}
				z = z - 2;
				System.out.println();
			}
			// TODO Auto-generated method stub

		}
		sc.close();
	}

}
