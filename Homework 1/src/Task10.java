import java.util.Scanner;

public class Task10 {
/*Задача 10:
Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Каква вместимост има цистерната?(В интервал [10..9999]");
		int a = sc.nextInt();
		int b = a/5; //брой кофи
		int c = a%5; //остатък
		if (c==0) {
		System.out.println(b+" кофи по 2 литра");
		System.out.println(b+" кофи по 3 литра");
		}
		else if (c==1) {
			b = b -1;
			System.out.println(b+" кофи по 2 литра");
			System.out.println(b+" кофи по 3 литра");
			System.out.println("допълнително 2 кофи от 3л.");
		}
		else if (c == 2) {
			System.out.println(b+" кофи по 2 литра");
			System.out.println(b+" кофи по 3 литра");
			System.out.println("допълнително кофа от 2 литра");	
		}
		if (c==3) {
			System.out.println(b+" кофи по 2 литра");
			System.out.println(b+" кофи по 3 литра");
			System.out.println("допълнително кофа от 3 литра");
		}
		if (c==4) {
			System.out.println(b+" кофи по 2 литра");
			System.out.println(b+" кофи по 3 литра");
			System.out.println("допълнително 2 кофи от 2л.");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
