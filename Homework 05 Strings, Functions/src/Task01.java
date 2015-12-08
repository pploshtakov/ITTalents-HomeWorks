import java.util.Scanner;

/*Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
*/
public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете текст. (до 40 символа)");
		String text = sc.nextLine();
		validText(text, sc);
		System.out.println("Въведете 2-ри текст. (до 40 символа)");
		String text1 = sc.nextLine();
		validText(text1, sc);
		System.out.println("1-ви въведен текст: " + text);
		System.out.println("2-ри въведен текст: " + text1);
		System.out.println(text.toUpperCase() + " " + text.toLowerCase());
		System.out.println(text1.toUpperCase() + " " + text1.toLowerCase());
		// TODO Auto-generated method stub

	}

	static String validText(String text, Scanner sc) {
		while (text.length() > 40) {
			System.out.println("Повторете текста. (до 40 символа)");
			text = sc.nextLine();
		}
		return text;
	}
}
