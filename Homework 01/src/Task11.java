import java.util.Scanner;

public class Task11 {
	/*
	 * Задача 11: Съставете програма, която по дадено трицифренo число проверява
	 * дали числото се дели на всяка своя цифра. Във въведеното число да няма
	 * цифра 0.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число (в числото да няма 0)");
		int number = sc.nextInt();
		int x = number / 100;
		int x1 = number % 100;
		int y = x1 / 10;
		int z = number % 10;
		if (number % x == 0) {
			System.out.println(number + " се дели на " + x);
		} else {
			System.out.println(number + " не се дели на " + x);
		}
		if (number % y == 0) {
			System.out.println(number + " се дели на " + y);
		} else {
			System.out.println(number + " не се дели на " + y);
		}
		if (number % z == 0) {
			System.out.println(number + " се дели на " + z);
		} else {
			System.out.println(number + " не се дели на " + z);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}