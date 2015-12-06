import java.util.Scanner;

public class Task02 {
	/*
	 * 2. Напишете програма, която отпечатва на екрана инициалите на името ви.
	 * Въведете името си от клавиатурата.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 3-те си имена.");
		String name = sc.nextLine();
		String initials = name.toUpperCase();
		for (int i = 0; i < initials.length(); i++) {
			if (i == 0 && initials.charAt(i) != ' ') {
				System.out.print(initials.charAt(i) + ".");
			} else if (initials.charAt(i) == ' ' && initials.charAt(i + 1) != ' ' ) {
				System.out.print(initials.charAt(i + 1) + ".");
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
