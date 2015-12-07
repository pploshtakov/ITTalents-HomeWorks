
import java.util.Scanner;

/*Задача 9:
Да се състави програма, която чете от конзолата 2 естествени
двуцифрени числа a,b.
Програмата да изведе в конзолата дали последната цифра от
произведението на двете числа е четна, както и самата цифра.
Входни данни: a,b - естествени числа от интервала [10..99].
*/
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете двуцифрено число.");
		int a = sc.nextInt();
		System.out.println("Въведете двуцифрено число.");
		int b = sc.nextInt();
		int x = a * b;
		int y = x % 10;
		if (y % 2 == 0) {
			System.out.println(x + "," + y + " четно");
		} else {
			System.out.println(x + "," + y + " нечетно");
		}
		sc.close();

		// TODO Auto-generated method stub

	}

}