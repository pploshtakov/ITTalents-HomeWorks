import java.util.Scanner;

/*Задача 2:
Въведете 2 различни целочислени числа от конзолата. Запишете
тяхната сума, разлика, произведение, остатък от деление и
целочислено деление в отделни променливи и разпечатайте тези
резултати в конзолата. Опитайте същото с числа с плаваща запетая.
*/
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете стойност за A");
		int a;
		a = sc.nextInt();
		System.out.println("Моля въведете стойност за B");
		int b;
		b = sc.nextInt();
		System.out.println(("A = " + a) + (" , B = " + b));
		int c;
		c = a + b;
		System.out.println("C = A+B = " + c);
		int d;
		d = a - b;
		System.out.println("D = A-B = " + d);
		int e;
		e = a * b;
		System.out.println("E = A*B = " + e);
		int f;
		f = a / b;
		System.out.println("F = A/B = " + f);
		int g;
		g = a % b;
		System.out.println("G = A%B = " + g);
		System.out.println("Моля въведете стойност за А1");
		double a1;
		a1 = sc.nextDouble();
		System.out.println("Моля въведете стойност за B1");
		double b1;
		b1 = sc.nextDouble();
		System.out.println(("A1 = " + a1) + (", B1 = " + b1));
		double c1;
		c1 = a1 + b1;
		System.out.println("C1 = A1+B1 = " + c1);
		double d1;
		d1 = a1 - b1;
		System.out.println("D1 = A1-B1 = " + d1);
		double e1;
		e1 = a1 * b1;
		System.out.println("E1 = A1*B1 = " + e1);
		double f1;
		f1 = a1 / b1;
		System.out.println("F1 = A1/B1 = " + f1);
		double g1;
		g1 = a1 % b1;
		System.out.println("G1 = A1%B1 = " + g1);
		sc.close();
		System.out.println("End of program.");

		// TODO Auto-generated method stub

	}

}