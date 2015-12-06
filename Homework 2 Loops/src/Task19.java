import java.util.Scanner;

public class Task19 {
	/*
	 * Задача 19: Да се състави програма, чрез която по въведено естествено
	 * число от интервала [10..99] се извежда поредица числа, при спазване на
	 * следните изисквания: 1) ако предходното число е четно се извежда
	 * 0.5*числото; 2) ако предходното число е нечетно се извежда 3*числото +1.
	 * Извеждането продължава докато не се получи стойност 1.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Въведете число.(В интервала 10..99)");
			number = sc.nextInt();
		} while (number < 10 || number > 99);
		while (number != 1) {
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = (number * 3) + 1;
			}
			System.out.print(number + " ");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
