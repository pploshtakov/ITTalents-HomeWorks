import java.util.Scanner;

public class Task06 {
	/*
	 * Задача 6: Да се състави програма, чрез която се въвежда изречение с
	 * отделни думи. Като резултат на екрана да се извежда същия текст, но всяка
	 * отделна дума да започва с главна буква, а следващите я букви да са малки.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете изречение.");
		String sen = sc.nextLine();
		String senNew = uppercaseFirstLetters(sen);
		System.out.println(sen);
		System.out.println(senNew);
		// TODO Auto-generated method stub
		sc.close();
	}

	static String uppercaseFirstLetters(String sen) {
		char[] chars = sen.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				chars[i] = Character.toUpperCase(chars[i]);
			} else if (chars[i] == ' ' || chars[i] == '.' || chars[i] == ',' || chars[i] == '!' || chars[i] == '?'
					|| chars[i] == ':' || chars[i] == '-') {
				chars[i + 1] = Character.toUpperCase(chars[i + 1]);
			}
		}
		return new String(chars);
	}
}
