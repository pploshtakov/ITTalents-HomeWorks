import java.util.Scanner;

public class Task04 {
	/*
	 * Задача 4: Да се състави програма, чрез която по въведени начална и крайна
	 * цифра се извеждат на всеки нов ред следната последователност (триъгълник
	 * от знаци):
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N(N > 0)");
		int n = sc.nextInt();
		n = validNumber(n,sc);
		System.out.println("Въведете М(М > 0)");
		int m = sc.nextInt();
		m = validNumber(m,sc);
		int first;
		if (n < m) {
			first = n;
			printTriangle(n,m,first);
		} else {
			first = m;
			printTriangle(m,n,first);
		}
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	static int validNumber(int n, Scanner sc) {
		while (n < 1) {
			System.out.println("Повторете числото > 0!");
			n = sc.nextInt();
		}
		return n;
	}
	static void printTriangle(int n, int m,int furst) {
		if (n > m) {
			return;
		}
		for (int i = furst; i <= n; i++ ) {
			System.out.print(i);
		}
		System.out.println();
		printTriangle(n + 1, m, furst);
	}
}
