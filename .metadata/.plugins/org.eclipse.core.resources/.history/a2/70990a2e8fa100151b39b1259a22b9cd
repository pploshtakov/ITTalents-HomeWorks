
public class College {
	// да се напише клас College(с мейн метод), който демонстрира използването на класовете
	// Student и StudentGroup.
	// (създава няколко студента, добавя стипендия на накои от тях, прехвърля някои от тях в по горна година,
	// Създава няколко групи от студенти, добавя студенти в тях, изкарва името на най-добрия студент
	// от някоя от групите
	public static void main(String[] args) {
		Student ivan = new Student();
		Student gosho = new Student("Gosho", "Geodeziq", 19);
		Student pesho = new Student("Pesho", "Geodeziq", 19);
		Student martin = new Student("Martin","Geodeziq", 19);
		Student vladi = new Student("Vladi","Geodeziq", 19);
		Student rali = new Student("Rali", "Geodeziq",19);
		Student gabi = new Student("Gabi", "SSS",19);
		Student ivo = new Student("Ivo", "SSS",19);
		Student niq = new Student("Niq", "SSS",19);
		Student iva = new Student("Iva", "SSS",19);
		Student simo = new Student("Simo", "SSS",19);
		pesho.grade = 5.5;
		rali.grade = 6.00;
		ivo.grade = 5.75;
		gabi.grade = 5.5;
		pesho.receiveScholarship(5.5, 20);
		rali.receiveScholarship(5.5, 30);
		ivo.receiveScholarship(5.5, 25);
		gabi.receiveScholarship(5.5, 20);
		System.out.println("The success of Pesho 's " + pesho.grade);
		System.out.println("Money are Pesho " + pesho.money);
		gosho.upYear();
		pesho.upYear();
		martin.upYear();
		ivan.upYear();
		vladi.upYear();
		rali.upYear();
		System.out.println("Rali is " + rali.yearInColleg + " years in college.");
		StudentGroup geodeziq = new StudentGroup("Geodeziq");
		StudentGroup sss = new StudentGroup();
		geodeziq.addStudentInGroup(gosho);
		geodeziq.addStudentInGroup(pesho);
		geodeziq.addStudentInGroup(martin);
		geodeziq.addStudentInGroup(ivan);
		geodeziq.addStudentInGroup(vladi);
		geodeziq.addStudentInGroup(rali);
		sss.addStudentInGroup(gabi);
		sss.addStudentInGroup(ivo);
		sss.addStudentInGroup(niq);
		sss.addStudentInGroup(simo);
		sss.addStudentInGroup(iva);
		geodeziq.printStudentsInGroup();
		System.out.println(geodeziq.theBestStudent());









		
		
		
		
		
		
		
		
	}
}
