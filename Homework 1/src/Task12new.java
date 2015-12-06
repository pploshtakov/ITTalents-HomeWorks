import java.util.Scanner;

public class Task12new {
	/*
	 * Високосни години са всички години кратни на 4 с изключения столетията, но
	 * без столетия кратни на 400, т.е. 1900 не е високосна, но 1600 и 2000 са
	 * високосни. Съставете програма, която по дадени ден, месец, година
	 * отпечатва следващата дата. Входни данни: три числа за ден, месец, година.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден.");
		int day = sc.nextInt();
		System.out.println("Въведете месец.");
		int month = sc.nextInt();
		System.out.println("Въведете година.");
		int year = sc.nextInt();
		System.out.println(day + "." + month + "." + year);
		if (day > 0 && day < 27) {
			System.out.println(day + 1 + "." + month + "." + year);
		} else {
			if ((month == 2) && (year % 4 == 0) && (year % 100 != 0) || (month == 2) && (year % 400 == 0)) {
				if (day <= 28) {
					System.out.println(day + 1 + "." + month + "." + year);
				} else {
					System.out.println(1 + "." + (month + 1) + "." + year);
				}
			} else if (month == 2 && day == 28) {
				System.out.println(1 + "." + (month + 1) + "." + year);
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
				if (day > 27 && day < 31) {
					System.out.println((day + 1) + "." + month + "." + year);
				} else {
					System.out.println(1 + "." + (month + 1) + "." + year);
				}
			} else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 27 && day < 30) {
					System.out.println((day + 1) + "." + month + "." + year);
				} else {
					System.out.println(1 + "." + (month + 1) + "." + year);
				}
			} else if (month == 12) {
				if (day > 27 && day < 31) {
					System.out.println((day + 1) + "." + month + "." + year);
				} else {
					System.out.println(1 + "." + 1 + "." + (year + 1));
				}
			}
			sc.close();
		}
	}
}

// TODO Auto-generated method stub
