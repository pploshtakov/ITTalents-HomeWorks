import java.util.Scanner;

public class Task15 {
/*Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час.(0..24)");
		float time = sc.nextFloat();
		if ((time >= 4) && (time <= 9)) {
			System.out.println("Добро утро.");
		}
		if ((time >= 9.01) && (time <= 18)) {
			System.out.println("Добър ден.");
		}
		if ((time >= 18.01) && (time <=24) || (time > 0) && (time <4)) {
			System.out.println("Добър вечер.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
