import java.util.Scanner;

public class Task21a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Дадено е наредено тесте карти.");
		int card;
		char c = '\u2663'; // club
		char d = '\u2666'; // diamond
		char h = '\u2665'; // hearts
		char s = '\u2660'; // spade
		char color = 'c';
		int i = 1;
		do {
			System.out.println("Въведете число. (от 1 до 51)");
			card = sc.nextInt();
		} while (card < 1 || card > 51);
		if (card >= 1 && card <= 4) {
			i = 2;
		} else if (card > 4 && card <= 8) {
			i = 3;
		} else if (card > 8 && card <= 12) {
			i = 4;
		} else if (card > 12 && card <= 16) {
			i = 5;
		} else if (card > 16 && card <= 20) {
			i = 6;
		} else if (card > 20 && card <= 24) {
			i = 7;
		} else if (card > 24 && card <= 28) {
			i = 8;
		} else if (card > 28 && card <= 32) {
			i = 9;
		} else if (card > 32 && card <= 36) {
			i = 10;
		} else if (card > 36 && card <= 40) {
			i = 11;
		} else if (card > 40 && card <= 44) {
			i = 12;
		} else if (card > 44 && card <= 48) {
			i = 13;
		} else {
			i = 14;
		}
		for (; i <= 13; i++) {
			for (int g = 0; g <= 3; g++) {
				if (g == 0) {
					color = c;
				} else if (g == 1) {
					color = d;
				} else if (g == 2) {
					color = h;
				} else {
					color = s;
				}
				if (i > 0 && i <= 9) {
					System.out.print(i + 1 + "" + color + ",");
				} else if (i == 10) {
					System.out.print("J" + color + ",");
				} else if (i == 11) {
					System.out.print("Q" + color + ",");
				} else if (i == 12) {
					System.out.print("K" + color + ",");
				} else if (i == 13) {
					if (g == 3) {
						System.out.print("A" + color);
					} else {
						System.out.print("A" + color + ",");
					}
				} else {
					if (card == 49) {
						System.out.print("A" + d + "," + "A" + h + "," + "A" + s);
					} else if (card == 50) {
						System.out.print("A" + h + "," + "A" + s);
					} else {
						System.out.print("A" + s);
					}
				}
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
