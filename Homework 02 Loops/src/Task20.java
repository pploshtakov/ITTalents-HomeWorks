public class Task20 {
	/*
	 * Задача 20: Да се състави програма, чрез която се извежда квадрат от
	 * цифри. Сумите от елементите на произволен ред или стълб са равни на 45.
	 */
	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i <= 9; i++) {
			k--;
			if (k == -1) {
				k = 9;
			}
			for (int g = 0; g <= 9; g++) {
				k--;
				if (k == -1) {
					k = 9;
				}
				System.out.print(k + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
