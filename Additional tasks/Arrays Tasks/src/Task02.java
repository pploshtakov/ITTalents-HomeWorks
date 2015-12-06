import java.util.Scanner;

public class Task02 {
	/*
	 * Едномерен масив наричаме назъбен, ако всеки елемент в масива е > от
	 * предишния и < от следващия. Напишете програма, която проверява дали даден
	 * масив от числа е назъбен.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = submitArray(sc);
		checkToothed(arr);
		
		
		
		
		
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
	static void checkToothed(int[] arr) {
		boolean toothed = true;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] || arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
				toothed = true;
			} else {
				toothed = false;
				break;
			}
		}
		if (toothed == true) {
			System.out.println("Масива е назъбен.");
		} else {
			System.out.println("Масива не е назъбен.");
		}
	}
}
