public class Task18 {
	/*
	 * Задача 18: Дадени са два едномерни масива с естествени числа. Да се
	 * състави програма, която сравнява всички числа с еднакви индекси от двата
	 * масива и записва в трети масив, по-голямото от двете числа. Да се изведе
	 * съдържанието и на трите масива
	 */
	public static void main(String[] args) {
		int[] arr = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr1 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			if (arr[i] > arr1[i]) {
				arr2[i] = arr[i];
			} else {
				arr2[i] = arr1[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("1-ви въведен масив - [" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("2-ри въведен масив - [" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("Нов масив - [" + arr2[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr2[i] + "]");
			} else {
				System.out.print(arr2[i] + ",");
			}
		}
		// TODO Auto-generated method stub

	}

}
