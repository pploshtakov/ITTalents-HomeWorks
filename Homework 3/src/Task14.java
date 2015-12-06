
public class Task14 {
	/*
	 * Задача 14: Имате предварително въведен едномерен масив, съдържащ реални
	 * числа. Да се състави програма, чрез която се избират само елементи от
	 * масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
	 * масив. Новият масив да се извежда на екрана.
	 */
	public static void main(String[] args) {
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				count++;
			}
		}
		double[] arr1 = new double[count];
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				arr1[count1] = arr[i];
				count1++;
			}
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
				System.out.print("Нов масив (стойности -2.99..2.99) - [" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		// TODO Auto-generated method stub

	}

}
