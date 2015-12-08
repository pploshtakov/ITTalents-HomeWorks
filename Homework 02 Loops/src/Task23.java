public class Task23 {
	/*
	 * Задача 23: Да се състави програма, която чрез цикъл while извежда
	 * таблицата за умножение, но без повторение. Т.е. ако е изведено 4*5 не се
	 * извежда 5*4.
	 */
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		while (x <= 9) {
			if (x == 9) {
				System.out.println(x + "*9" + " = " + (x * y));
				break;
			}
			while (y <= 9) {
				if (y >= x) {
					System.out.print(x + "*" + y + " = " + (x * y) + ";");
				}
				y++;
			}
			System.out.println();
			y = 1;
			x++;
		}
		// TODO Auto-generated method stub

	}

}