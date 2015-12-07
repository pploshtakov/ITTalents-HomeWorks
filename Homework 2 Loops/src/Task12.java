public class Task12 {
	/*
	 * Задача 12: Да се състави програма, която извежда всички естествени
	 * трицифрени числа, които нямат еднакви цифри т.е. 100,101, 606 и т.н. не
	 * се извеждат.
	 */
	public static void main(String[] args) {
		for (int x = 100; x < 999; x++) {
			int a = x / 100;
			int a1 = x % 100;
			int b = a1 / 10;
			int c = x % 10;
			if (a != b && a != c && b != c) {
				System.out.println(x);
			}
		}
		// TODO Auto-generated method stub

	}

}
