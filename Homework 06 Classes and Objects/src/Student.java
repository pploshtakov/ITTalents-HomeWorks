
public class Student {
	String name;
	String subject;
	double grade;
	int yearInColleg;
	int age;
	boolean isDegree;
	double money;
	// конструктор по подразбиране, който подава следните стойности на полетата:
	// grade = 4.0, yearInColleg = 1, isDegree = false, money = 0
	Student() {
		this.grade = 4;
		this.yearInColleg = 1;
		this.isDegree = false;
		this.money = 0;
	}
	// контруктор, който извиква конструктора по подразбиране и приема като аргументи останалите стойности за обекта
	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	// void upYear() , който увеличава годината в колежа с единица,
	// ако студента не е завършил, в противен случай извежда подходящо съобщение.
	// Ако след увеличаването годината стане 4, задава true на полето isDegree.
	void upYear() {
		if (this.yearInColleg < 4) {
			this.yearInColleg += 1;
			if (this.yearInColleg == 4) {
				this.isDegree = true;
			}
		} else {
			System.out.println("The student has completed their training!");
		}
	}
	// double receiveScholarship(double min, double amount), добавя сумата amount
	// към парите на студента, само ако успеха му е по-висок или равен
	// на минималния успех подаден като параметър (min) и ако възрастта му е
	// под 30г. Метода връща текущите пари на студента (след евентоалното им увеличаване).
	double receiveScholarship(double min, double amount) {
		if (this.grade >= min) {
			this.money += amount;
		} else {
			System.out.println("Students will need success!");
		}
		return this.money;
	}
	
	
	
	
	
}
