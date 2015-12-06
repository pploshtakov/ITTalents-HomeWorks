import java.util.Scanner;

public class Task22 {
	/*
	 * Задача 22: Да се състави програма, която извежда първите 10 най-малки
	 * числа, които се делят на 2, 3 или на 5 и които са по-големи от въведено
	 * естествено число. Числата се извеждат, заедно с техния пореден номер.
	 * Входни данни: число от интервала [1..999]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Въведете N(1<=N<=999)");
			n = sc.nextInt();
		} while (n < 1 || n > 999);
		int x = n + 1;
		int y = 1;
		while (x <= 1014) {
			if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
				if (y == 10) {
					System.out.print(y + ":" + x);
					break;
				} else {
					System.out.print(y + ":" + x + ",");
					y++;
				}
			}
			x++;
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
