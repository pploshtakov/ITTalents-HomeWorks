import java.util.Scanner;

public class Task09 {
	/*
	 * Задача 9: Да се прочетат 2 числа от клавиатурата А и В. Да се изведат
	 * всички числа от А до В на степен 2(разделени с запетая).Ако някое число е
	 * кратно на 3, да се изведе съобщение че числото се пропуска „skip 3“.Ако
	 * сумата от всички изведени числа (без пропуснатите) стане по-голяма от
	 * 200, да се прекрати извеждането.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А");
		int a = sc.nextInt();
		System.out.println("Въведете B");
		int b = sc.nextInt();
		int sum = 0;
		if (a > b) {
			int x = a;
			a = b;
			b = x;
		}
		while (a <= b) {
			if (a % 3 != 0) {
				System.out.println(a * a);
				sum = sum + (a * a);
				a++;
			} else {
				System.out.println("skip " + (a * a));
				a++;
			}
			if (sum >= 200) {
				break;
			}
		}
		sc.close();
	}
	// TODO Auto-generated method stub

}
