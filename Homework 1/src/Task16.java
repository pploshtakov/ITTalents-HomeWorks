import java.util.Scanner;

public class Task16 {
/*Задача 16:
Въведено е трицифрено естествено число от вида abc.
Трябва да се провери дали:
ако a = b = c - Изход: цифрите са равни;
ако a>b>c - Изход: цифрите са във възходящ ред;
ако a<b<c цифрите са в низходящ ред;
и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число.");
		int number = sc.nextInt();
		int a = number/100;
		int a1 = number%100;
		int b = a1/10;
		int c = number%10;
			if ((a==b)&&(a==c)) {
				System.out.println("Цифрите са равни");
			}
			else if ((a>b)&&(b>c)) {
				System.out.println("Цифрите са във възходящ ред.");
			}
			else if ((a<b)&&(b<c)) {
				System.out.println("Цифрите са в низходящ ред");
			}
		else {
			System.out.println("Цифрите са ненаредени във възходящ ред, в низходящ и не са равни.");
		
		}
			sc.close();
		// TODO Auto-generated method stub

	}

}
