package PersonClasses;
//Класът Student наследяващ Person, репрезентиращ ученик
public class Student extends Person {
	protected double score;

	/*
	 * Единствен конструктор: Student(String name, int age, boolean isMale,
	 * double score) задаващ стойности и на наследените полета
	 */

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score = score;

	}

	/*
	 * Метод showStudentInfo() който показва информация за човека и информация
	 * за оценката му (чрез надписи на екрана)
	 */
	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Student's score: " + this.score);
	}

}
