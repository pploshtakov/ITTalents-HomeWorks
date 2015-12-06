import java.util.Scanner;

public class Task11 {
	/*
	 * Задача 11: Въведете число N чрез конзолата и изкарайте като резултат
	 * следния триъгълник с височина N:
	 *
	 ***
	 *****
	 * ................. Кaто допълнително упражнение – нарисувайте същия
	 * триъгълник, но незапълнен.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Въведете число(по-голямо от 1).");
			n = sc.nextInt();
		} while (n <= 1);
		for (int x = 1; x <= n; x++) { // първи триъгълник
			for (int y = 1; y <= n - x; y++) {
				System.out.print(" ");
			}

			for (int z = 1; z <= (2 * x) - 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int x = 1; x <= n; x++) { // втори триъгълник
			for (int y = 1; y <= n - x; y++) {
				System.out.print(" ");
			}
			if (x == n) {
				for (int z = 1; z <= (2 * x) - 1; z++) {
					System.out.print("*");
				}
			} else {

				for (int z = 1; z <= (2 * x) - 1; z++) {
					if (z == 1 || z == ((2 * x) - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
