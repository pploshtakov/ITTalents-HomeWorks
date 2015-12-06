import java.util.Scanner;
/*Задача 3:
Въведете 2 различни числа от конзолата и разменете стойността им.
Разпечатайте новите стойности
*/
public class task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете стойност за A");
		int a;
		a = sc.nextInt();
		System.out.println("Моля въведете стойност за B");
		int b;
		b = sc.nextInt();
		System.out.println(("A = "+a)+(", B = "+b));
	    int c;
	    c=a;
	    a=b;
	    b=c;
	    System.out.println(("A = "+a)+(", B = "+b));
	    sc.close();
	    
	
		
	
}

}
