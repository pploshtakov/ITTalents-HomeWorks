import java.util.Scanner;
/*Задача 5:
Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
ред.*/
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете стойност за A");
		int a;
		a = sc.nextInt();
		System.out.println("Моля въведете стойност за B");
		int b;
		b = sc.nextInt();
		System.out.println("Моля въведете стойност за C");
		int c;
		c = sc.nextInt();
		if (a<b && b<c) {
			System.out.print(c+","+b+","+a);	
		}
		else if (a<c && c<b) {
			System.out.println(b+","+c+","+a);
		}
		else if (b<a && a<c) {
			System.out.println(c+","+a+","+b);
		}
		else if (b<c && c<a) {
			System.out.println(a+","+c+","+b);
		}
		else if (c<b && b<a) {
			System.out.println(a+","+b+","+c);
		}
		else if (c<a && a<b) {
			System.out.println(b+","+a+","+c);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
