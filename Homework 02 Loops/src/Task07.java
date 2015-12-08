import java.util.Scanner;

public class Task07 {
	/*
	 * Задача 7: Започвайки от 3, да се изведат на екрана първите n числа които
	 * се делят на 3. Числата да са разделени със запетая.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n");
		int n = sc.nextInt();
		int y = 3;
		for (int x = 1; x <= n; x++) {
			if (x == n) {
				System.out.println(y);
			} else {
				System.out.print(y + ",");
				y = y + 3;
			}
			sc.close();
		}
		// TODO Auto-generated method stub

	}

}