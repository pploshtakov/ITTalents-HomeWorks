import java.util.Scanner;

public class Task03 {
	/*
	 * Задача 3: Да се въведе число, след което да се създаде масив с 10
	 * елемента по следния начин: Първите 2 елемента на масива са въведеното
	 * число. Всеки следващ елемент на масива е равен на сбора от предишните 2
	 * елемента в масива. След това изведете масива .
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N.");
		int n = sc.nextInt();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == 1) {
				arr[i] = n;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
