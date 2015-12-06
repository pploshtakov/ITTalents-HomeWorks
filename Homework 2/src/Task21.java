import java.util.Scanner;

public class Task21 {
	/*
	 * Задача 21: Дадено е наредено тесте карти. Наредбата по тежест на карта е:
	 * 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо. Наредбата по цвят на картите е:
	 * спатия, каро, купа, пика. Да се създаде програма, чрез която се въвежда N
	 * - число от интервала [1..51] и се извеждат въведения номер карта и
	 * останалите по-големи карти от тестето.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Дадено е наредено тесте карти.");
		int card;
		char c = '\u2663';
		char d = '\u2666';
		char h = '\u2665';
		char s = '\u2660';
		do {
			System.out.println("Въведете число. (от 1 до 51)");
			card = sc.nextInt();
		} while (card < 1 || card > 51);
		if (card >= 1 && card <= 13) {
			for (int club = card; club <= 13; club++) {
				if (club >= 1 && club <= 9) {
					System.out.print(club + 1 + "" + c + ",");
				} else if (club == 10) {
					System.out.print("J" + c + ",");
				} else if (club == 11) {
					System.out.print("Q" + c + ",");
				} else if (club == 12) {
					System.out.print("K" + c + ",");
				} else {
					System.out.print("A" + c + ",");
				}
			}
			card = 14;
			System.out.println();
		}
		if (card >= 14 && card <= 26) {
			for (int diamond = card; diamond <= 26; diamond++) {
				if (diamond >= 14 && diamond <= 22) {
					System.out.print(diamond - 12 + "" + d + ",");
				} else if (diamond == 23) {
					System.out.print("J" + d + ",");
				} else if (diamond == 24) {
					System.out.print("Q" + d + ",");
				} else if (diamond == 25) {
					System.out.print("K" + d + ",");
				} else {
					System.out.print("A" + d + ",");
				}
			}
			card = 27;
			System.out.println();
		}
		if (card >= 27 && card <= 39) {
			for (int hearts = card; hearts <= 39; hearts++) {
				if (hearts >= 27 && hearts <= 35) {
					System.out.print(hearts - 25 + "" + h + ",");
				} else if (hearts == 36) {
					System.out.print("J" + h + ",");
				} else if (hearts == 37) {
					System.out.print("Q" + h + ",");
				} else if (hearts == 38) {
					System.out.print("K" + h + ",");
				} else {
					System.out.print("A" + h + ",");
				}
			}
			card = 40;
			System.out.println();
		}
		if (card >= 40) {
			for (int spade = card; spade <= 51; spade++) {
				if (spade >= 40 && spade <= 48) {
					System.out.print(spade - 38 + "" + s + ",");
				} else if (spade == 49) {
					System.out.print("J" + s + ",");
				} else if (spade == 50) {
					System.out.print("Q" + s + ",");
				} else if (spade == 51) {
					System.out.print("K" + s + ",");
				}
			}
		}
		System.out.print("A" + s);
		sc.close();
		// TODO Auto-generated method stub

	}

}
