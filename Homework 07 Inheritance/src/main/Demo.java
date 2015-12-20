package main;

import PersonClasses.*;

public class Demo {

	public static void main(String[] args) {
		// 1.Да се състави масив от 10 елемента от тип Person.
		Person[] persons = new Person[10];
		// 2.Да се създадът по два обекта от тип Person, Student и Employee и да
		// се вкарат в масива от хора.
		persons[0] = new Person("Gosho", 20, true);
		persons[1] = new Person("Hrisi", 19, false);
		persons[2] = new Student("Simo", 21, true, 4.5);
		persons[3] = new Student("Ivan", 21, true, 5);
		persons[4] = new Employee("Pesho", 27, true, 40);
		persons[5] = new Employee("Emi", 25, false, 35);
		// 3.Да се обходим масива и в зависимост от това дали обекта е от тип
		// Person, Student или Employee да се извика съответно метода
		// showPersonInfo, showStudentInfo или showEmployeeInfo.
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				((Student) persons[i]).showStudentInfo();
			} else if (persons[i] instanceof Employee) {
				((Employee) persons[i]).showEmployeeInfo();
			} else if (persons[i] instanceof Person) {
				persons[i].showPersonInfo();
			}
		}
		// 4.Да се обходи още веднъж масива с хора и за всеки човек, който е
		// работник, да се изведе на екрана сумата, която му се дължи при 2
		// часа работа извън работно време.
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Employee) {
				System.out.println(
						persons[i].getName() + " payment for overtime " + ((Employee) persons[i]).calculateOvertime(2));
			}
		}
		/*
		 * И един въпрос, какво ще стане ако дефинирате конструктор без
		 * параметри Student() в класа Student ??? Възможно ли е, и ако не защо.
		 * Как може да се оправи това?
		 */
		
		/* Възможно е, но трябва в тялото му да зададем нулеви аргументи за супер конструктора.
		 */

		// TODO Auto-generated method stub

	}

}
