import java.util.Scanner;

public class Task25 {
	/*
	 * Задача 25: Да се направи програма, която по дадено число N, да изчислява
	 * N!, т.е. 1*2*3*4...*N. Пример: 5 Изход: 120 Използвайте цикъл do-while.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.");
		int n = sc.nextInt();
		double mult = 1;
		int x = 1;
		if (n > 0) {
			do {
				mult = mult * x;
				x++;
			} while (x <= n);
			System.out.println(mult);
		} else {
			if (n == 0) {
				System.out.println(0);
			} else {
				x = -1;
				do {
					mult = mult * x;
					x--;
				} while (x >= n);
				System.out.println(mult);
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}