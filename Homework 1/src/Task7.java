import java.util.Scanner;

public class Task7 {
	/*Задача 7:
Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
 - ако съм болен, няма да излизам
 - ако имам пари, ще си купя лекарства
 - ако нямам – ще стоя вкъщи и ще пия чай
 - ако съм здрав, ще отида на кино с приятели
 - ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата.
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час.");
		int time = sc.nextInt();
		System.out.println("Колко пари имате?");
		double money = sc.nextDouble();
		System.out.println("Аз съм болен?(true/false)");
		boolean sick = sc.nextBoolean();
		if (sick == true) {
			System.out.println("Няма да излизам.");
			if (money > 0) {
				System.out.println("Ще си купя лекарства.");
				
			}
			if (money <= 0) {
				System.out.println("Ще си стоя вкъщи и ще пия чай.");
			}
		}
		else {
			if (money<10) {
				System.out.println("Ще отида на кафе.");
			}
			else {
				System.out.println("Ще отида на кино.");
			}
			
		}
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
