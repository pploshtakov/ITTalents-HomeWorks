public class Task16 {
	/*
	 * Задача 16: Да се състави програма, чрез която предварително въведени 10
	 * реални числа от интервала се обработват по следния начин: 1. Извежда
	 * съществуващите числа. 2. Всички елементи със стойност по-малки от -0.231
	 * се заменят със сумата от квадрата на поредния им номер + числото 41.25, а
	 * всички останали елементи се заменят с произведението между самия елемент
	 * и неговият пореден номер. Поредният номер на първият елемент е 1. 3. Да
	 * се изведат елементите от началния и новообразувания масив.
	 */
	public static void main(String[] args) {
		float[] arr = { -1.12f, -2.43f, 3.1f, 4.2f, 0, 6.4f, -7.5f, 8.6f, 9.1f, -4 };
		float[] arr1 = new float[10];
		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] < -0.231) {
				arr1[i] = ((i + 1) * (i + 1)) + 41.25f;
			} else {
				arr1[i] = arr[i] * (i + 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("Въведен масив: [" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("Нов масив: [" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		// TODO Auto-generated method stub
	}
}