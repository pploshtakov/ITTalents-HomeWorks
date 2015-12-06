import java.util.Scanner;

public class Task15 {
	/*
	 * Задача 15: Да се състави програма, която въвежда в едномерен масив реални
	 * числа. Като изход: програма извежда онези 3 различни числа, чиято
	 * абсолютна стойност формира максималната обща сума.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		do {
			System.out.println("Въведете дължина на масива.");
			l = sc.nextInt();
		} while (l <= 0);
		double[] arr = new double[l];
		double x = 0;
		double x1 = 0;
		double y = 0;
		double y1 = 0;
		double z = 0;
		double z1 = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност на масива.");
			arr[i] = sc.nextDouble();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("Въведен масив -  [" + arr[i] + ",");
			}
			else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			}
			else {
				System.out.print(arr[i] + ",");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
					if (arr[i] * -1 >= z && arr[i] * -1 >= y && arr[i] * -1 >= x) {
						x = y;
						x1 = y1;
						y = z;
						y1 = z1;
						z = arr[i] * -1;
						z1 = arr[i];
					} else if (arr[i] * -1 <= z && arr[i] * -1 >= y && arr[i] * -1 >= x) {
						x = y;
						x1 = y1;
						y = arr[i] * -1;
						y1 = arr[i];
					} else if (arr[i] * -1 <= z && arr[i] * -1 <= y && arr[i] * -1 >= x) {
						x = arr[i] * -1;
						x1 = arr[i];
					}
			} else {
					if (arr[i] >= z && arr[i] >= y && arr[i] >= x) {
						x = y;
						x1 = y1;
						y = z;
						y1 = z1;
						z = arr[i];
						z1 = arr[i];
					} else if (arr[i] <= z && arr[i] >= y && arr[i] >= x) {
						y = z;
						y1 = z1;
						y = arr[i];
						y1 = arr[i];
					} else if (arr[i] <= z && arr[i] <= y && arr[i] >= x) {
						x = arr[i];
						x1= arr[i];
					}
				}
		}
		sc.close();
		System.out.println();
		System.out.println("Най - големи абсолютни стойности " + x1 + "," + y1 + "," + z1 );
		// TODO Auto-generated method stub

	}

}
