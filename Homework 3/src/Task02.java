import java.util.Scanner;

/*Задача 2:
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана.
*/
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масива.");
			l = sc.nextInt();
		} while (l < 1);
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност от масива.");
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
			arr1[arr.length + i] = arr[(arr.length + i) - ((i * 2) + 1)];
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("Въведен масив - [" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("Нов масив - [" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
