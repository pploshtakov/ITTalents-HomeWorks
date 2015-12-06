import java.util.Scanner;

public class Task24 {
	/*
	 * Задача 24: Едно число X е палиндром, aко се чете еднакво отпред назад и
	 * отзад напред. Да се състави програма, която проверява дали въведено число
	 * е палиндром. Входни данни: N - естествено число от интервала [10 ..
	 * 30000].
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Въведете число в интервала 10 .. 30000.");
			number = sc.nextInt();
		} while (number < 10 || number > 30000);
		int x;
		int y = 0;
		int number1 = number;
		do {
			x = number1 % 10;
			number1 = number1 / 10;
			y = (y * 10) + x;
		} while (number1 >= 1);
		if (number == y) {
			System.out.println("Числото е палиндром.");
		} else {
			System.out.println("Числото не е палиндром.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
