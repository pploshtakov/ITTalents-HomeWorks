import java.util.Scanner;

public class Task04 {
	/*
	 * Задача 4: Да се състави програма, чрез която по въведени трите имена на
	 * двама човека разделени със запетая, се извежда чие име има по-голям сбор
	 * от ASCII кодовете на съставящите името букви.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names;
		do {
			System.out.println("Въведете 3 имена на 2-ма човека.(Име.. , Име..)");
			names = sc.nextLine();
		} while (names.indexOf(',') < 0);
		System.out.println(names);
		System.out.println("По-дълго име:");
		printName(names);
		// TODO Auto-generated method stub
		sc.close();
	}

	static void printName(String name) {
		if (name.indexOf(',') > name.length() / 2) {
			for (int i = 0; i < name.indexOf(','); i++) {
				System.out.print(name.charAt(i));
			}
		} else if (name.indexOf(',') < name.length() / 2) {
			for (int i = name.indexOf(',') + 1; i < name.length(); i++) {
				System.out.print(name.charAt(i));
			}
		} else {
			System.out.println("Имената са с еднаква дължина.");
		}
	}
}
