import java.util.Scanner;

public class Task03 {
	/*
	 * Напишете програма, която за даден масив от символи arr и символ ch,
	 * въведен от потребителя, проверява али arr съдържа ch. Ако се съдържа,
	 * отпечатайте индекса на елемента. Ако не, отпечатайте подходящо избрана от
	 * вас стойност.
	 */
	public static void main(String[] args) {
		char[] arr = { '/', '-', '+', ')', '&', '%', '$', '@' };
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете символ.");
		char ch = sc.next().charAt(0);
		checkChars(arr, ch);
		sc.close();

		// TODO Auto-generated method stub

	}

	static void checkChars(char[] arr, char ch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.println("Символът " + ch + " се съдържа в клетка с индекс " + i);
				break;
			} else if (i == arr.length - 1) {
				System.out.println("Символът не присъства в масива.");
			}
		}
	}
}
