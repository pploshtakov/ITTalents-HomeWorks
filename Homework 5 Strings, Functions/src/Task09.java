import java.util.Scanner;

public class Task09 {
	/*
	 * Задача 9: Да се състави програма, чрез която по въведен низ съдържащ
	 * букви, цифри, знак минус '-' се извежда сборът на въведените числа като
	 * се отчита знакът '-' пред съответното число.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи.(съдържащ букви,цифри и знак минус)");
		String st = sc.nextLine();
		st = st.replaceAll("[^-?0-9]+", " ");
		st = st.replaceAll("- ", "-");
		st = st.trim();
		String[] numbers = st.split(" ");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
				sum += Integer.parseInt(numbers[i]);
		}
		System.out.println(sum);
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
