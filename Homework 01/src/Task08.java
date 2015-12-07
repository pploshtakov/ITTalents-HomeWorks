import java.util.Scanner;
/*Задача 8:
Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число.
*/

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число от интервала [1000 - 9999]");
		int x = sc.nextInt();
		int x1 = x / 1000; // първа цифра
		int x2 = x % 1000;
		int x3 = x2 / 100; // втора цифра
		int x4 = x2 % 100;
		int x5 = x4 / 10; // трета цифра
		int x6 = x4 % 10; // четвърта цифра
		int y = ((x1 * 10) + x6);
		int y1 = ((x3 * 10) + x5);
		if (y > y1) {
			System.out.println(y + ">" + y1);
		}
		if (y < y1) {
			System.out.println(y + "<" + y1);
		}
		if (y == y1) {
			System.out.println(y + "=" + y1);

		}
		sc.close();

		// TODO Auto-generated method stub

	}

}