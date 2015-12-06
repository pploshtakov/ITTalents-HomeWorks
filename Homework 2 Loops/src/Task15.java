import java.util.Scanner;

public class Task15 {
	/*
	 * Задача 15: Да се състави програма, която да изчисли сумата на всички
	 * числа от 1 до въведено число N.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.");
		int n = sc.nextInt();
		int x = 1;
		int sum = 0;
		if (n >= 0) {
			do {
				sum = sum + x;
				x++;
			} while (x <= n);
		} else {
			x = -1;
			do {
				sum = sum + x;
				x--;
			} while (x >= n);
		}
		sc.close();
		System.out.println("sum=" + sum);
		// TODO Auto-generated method stub

	}

}
