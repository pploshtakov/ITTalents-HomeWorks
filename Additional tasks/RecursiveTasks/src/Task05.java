import java.util.Scanner;

public class Task05 {
	/*
	 * Задача 5: Да се състави програма, чрез която се въвежда естествено число
	 * N. Програмата да извежда число, чиито цифри са написани в ред обратен на
	 * въведеното число. Да се извежда съобщение дали въведеното число е
	 * палиндром.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число.");
		int number = sc.nextInt();
		if (number < 0) {
			number = number * -1;
		}
		int count = 1;
		int number1 = 0;
		number1 = chechPalindrom(number, number1, count);
		if (number == number1) {
			System.out.println(number1 + " е палиндром на " + number);
		} else {
			System.out.println(number1 + " не е палиндром на " + number);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

	static int chechPalindrom(int number, int number1, int count) {
		if (number / 10 == 0) {
			int d = number % 10;
			number1 = number1 * count + d;
			return number1;
		}
		if (count == 1) {
			int d = number % 10;
			number1 = d * count + number1;
			count *= 10;
		} else {
			int d = number % 10;
			number1 = number1 * count + d;
		}
		return chechPalindrom(number / 10, number1, count);
	}
}
