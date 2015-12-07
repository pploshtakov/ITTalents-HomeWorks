
import java.util.Scanner;

/*Напишете програма, която проверява дали в масив от цели
числа всички числа са неотрицателни.*/
public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = submitArray(sc);
		checkPositive(arr);

		// TODO Auto-generated method stub

	}

	static int[] submitArray(Scanner sc) {
		int l;
		do {
			System.out.println("Въведете дължина на масива.");
			l = sc.nextInt();
		} while (l < 1);
		int arr[] = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете стойност за " + (i + 1) + " позиция от масива.");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static void checkPositive(int arr[]) {
		boolean allPositive = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				allPositive = false;
			}
		}
		if (allPositive == true) {
			System.out.println("Всички числа от масива са положителни.");
		} else {
			System.out.println("В масива има отрицателни числа.");
		}
	}
}
