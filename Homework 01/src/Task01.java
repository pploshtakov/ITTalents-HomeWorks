
import java.util.Scanner;
/* Задача 1:
	Да се изведат съобщения към потребителя и да се прочетат 2 числа от
	клавиатурата A и B (може да са с плаваща запетая – double).
	После да се прочете 3-то число C и да се провери дали то е м/у A и B.
	Да се изведе подходящо съобщение за това дали C е между A и B. */

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете стойнос за А");
		double a;
		a = sc.nextDouble();
		System.out.println("Моля въведете стойнос за В");
		double b;
		b = sc.nextDouble();
		System.out.println(("А=" + a) + (" В=" + b));
		System.out.println("Моля въведете стойност за С");
		double c;
		c = sc.nextDouble();
		if (a < c == b > c) {
			System.out.println("A<C<B");
		} else {
			System.out.println("C не влиза в интервала АВ");
			if (a < c && b < c) {
				System.out.println("A,B < C");

			}
			if (a > c && b > c) {
				System.out.println("A,B > C");

			}
		}

		sc.close();

		// TODO Auto-generated method stub

	}

}
