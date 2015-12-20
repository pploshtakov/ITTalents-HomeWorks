package PersonClasses;

public class Person {
	private String name;
	protected int age;
	protected boolean isMale;
//	Коструктори:
//		Единствен конструктор, с параметри за всичките полета на класа
	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.age = age;
		this.isMale = isMale;
	}
	//	Метод:
//		Метод showPersonInfo, който показва информация за човека (изписва
//		на конзолата стойността на всичките му полета по подходящ начин)
	public void showPersonInfo() {
		System.out.println("The name is " + this.getName());
		System.out.println(this.age + " years old.");
		if (isMale) {
			System.out.println("Male.");
		} else {
			System.out.println("Female");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
