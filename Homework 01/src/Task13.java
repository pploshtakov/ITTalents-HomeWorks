import java.util.Scanner;

public class Task13 {
	/*
	 * Задача 13: Да се състави програма, която да отгатне колко е студено/топло
	 * по въведената температура t в градус Целзий. Температурните интервали са:
	 * под -20 ледено студено; между 0 и -20 - студено; между 15 и 0 - хладно;
	 * между 25 и 15 - топло; над 25 – горещо. Входни данни: цяло число от
	 * интервала [-100..100].
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете температура.");
		byte t = sc.nextByte();
		if (t <= -20) {
			System.out.println("Ледено студено.");
		}
		if ((t > -20) && (t < 0)) {
			System.out.println("Студено.");
		}
		if ((t > -1) && (t < 15)) {
			System.out.println("Хладно.");
		}
		if ((t > 14) && (t < 25)) {
			System.out.println("Топло.");
		}
		if (t > 24) {
			System.out.println("Горещо.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}