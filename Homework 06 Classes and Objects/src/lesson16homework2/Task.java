package lesson16homework2;

public class Task {
	/*
	 * Задача 1: Да се създадат класовете Task и Employee, като се спази
	 * принципа за капсулация на данните. Класът Task представя някакво
	 * количество работа(задача) което трябва да бъде свършено. Класът да има
	 * следните полета: име workingHours – числов тип, който показва колко
	 * часа остават на задачата за да бъде изпълнена
	 */
	private String name;
	private double workingHours;

	/*
	 * Класът да има конструктор които задава валидни стойности на 2-те полета.
	 */
	Task(String name, double workingHours) {
		if (!name.equals("") && !name.equals(null)) {
			this.name = name;
		} else {
			System.out.println("You must enter a name.");
		}
		if (workingHours > 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Working hours must be greater than zero!");
		}
	}

	/*
	 * Да се направят подходящи методи за достъпване на полетата (setters and
	 * getters).
	 */
	void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Working hours must be greater than zero!");
		}
	}

	double getWorkingHours() {
		return this.workingHours;
	}

	void setName(String name) {
		if (!name.equals("") && !name.equals(null)) {
			this.name = name;
		} else {
			System.out.println("You must enter a name.");
		}
	}

	String getName() {
		return this.name;
	}

}
