
public class Task01 {
	/*
	 * Задача 1: Имате двумерен масив 6х5 от естествени числа, чийто стойности
	 * са въведени предварително. Да се състави програма, чрез която се извеждат
	 * елементите от масива с най-малката и най-голямата стойност.
	 */
	public static void main(String[] args) {
		int[][] arr = { { 51, 24, 34, 38, 41 }, { 15, 98, 88, 46, 23 }, { 11, 20, 30, 44, 55 }, { 11, 19, 17, 12, 13 },
				{ 84, 15, 16, 45, 75 } };
		int small = 0;
		int big = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int g = 0; g < arr[i].length; g++) {
				if (i == 0 && g == 0) {
					small = arr[i][g];
					big = arr[i][g];
				}
				if (arr[i][g] < small) {
					small = arr[i][g];
				} else if (arr[i][g] > big) {
					big = arr[i][g];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int g = 0; g < arr[i].length; g++) {
				if (g != arr[i].length - 1) {
					System.out.print(arr[i][g] + ",");
				} else {
					System.out.print(arr[i][g]);
				}
			}
		}
		System.out.println();
		System.out.println("Най-голямо - " + big);
		System.out.println("Най-малко - " + small);
		// TODO Auto-generated method stub

	}

}
