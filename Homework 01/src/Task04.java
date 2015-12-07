import java.util.Scanner;

/*Задача 4:
Въведете 2 различни числа от конзолата и ги разпечатайте в
нарастващ ред.*/
public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете стойност за X");
		int x;
		x = sc.nextInt();
		System.out.println("Моля въведете стойност за Y");
		int y;
		y = sc.nextInt();
		if (x > y) {
			System.out.println(y);
			System.out.println(x);

		} else {
			System.out.println(x);
			System.err.println(y);
			sc.close();

		}
		// TODO Auto-generated method stub

	}

}