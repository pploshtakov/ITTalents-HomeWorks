import java.util.Scanner;

public class Task14 {
	/*
	 * Задача 14: Да се състави метод, който приема за стойност число N и връща
	 * стойността на N! (N факториел).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.");
		int n = sc.nextInt();
		int nFact = calculateNFact(n);
		System.out.println(n + "! = " + nFact);
		int nFactRecurs = nFactRecurs(n);
		System.out.println(n + "! = " + nFactRecurs);
		sc.close();

		// TODO Auto-generated method stub

	}

	static int calculateNFact(int n) {
		int nFact = 1;
		for (int i = 1; i <= n; i++) {
			nFact *= i;
		}
		return nFact;
	}

	static int nFactRecurs(int n) {
		int nFact;
		if (n == 1) {
			return 1;
		} else {
			nFact = n * (nFactRecurs(n - 1));
			return nFact;
		}
	}
}
