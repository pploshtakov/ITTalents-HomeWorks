package lesson16homework2;

public class Employee {
	/*
	 * Да се създаде клас Employee репрезентиращ работник. Класът да има
	 * следните полета: name – име на работника currentTask – обект от тип
	 * Task, който показва текущата задача в/у която работи работника hoursLeft
	 * – числова стойност, която показва колко работни часа остават на работника
	 * (за днес)
	 */
	private String name;
	private Task currentTask;
	private double hoursLeft;
	/*
	 * поле allWork – референция към множеството от всичките задачи. Всички
	 * работници работят с едно множество от задачи
	 */
	private AllWork allWork;

	// Класът да има конструктор с 1 параметър, който инициализира полето name.
	Employee(String name) {
		if (!name.equals("") && !name.equals(null)) {
			System.out.println("You must enter a name.");
		} else {
			this.name = name;
		}
	}

	Employee(String name, AllWork allWork) {
		this.setName(name);
		this.startWorkingDay();
		this.allWork = allWork;
	}

	/*
	 * Да се направят подходящи getter-и и setter-и за полетата на класа
	 * (setter-ите да проверяват дали данните са валидни - името да не празно,
	 * часовете да са положително число...).
	 */
	public void setName(String name) {
		if (!name.equals("") && !name.equals(null)) {
			this.name = name;
		} else {
			System.out.println("You must enter a name.");
		}
	}

	public String getName() {
		return this.name;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Hours must be a positive!");
		}
	}

	public double getHoursLeft() {
		return this.hoursLeft;
	}

	/*
	 * Да се направи метод без параметри work() на класа Employee. С извикването
	 * на този метод, работника за който е извикан метода работи по текущата си
	 * задача (ако има такава). Например ако работника има останали 4 часа за
	 * работа, а по задачата има останали 7 часа работа, след изпълнението на
	 * метода работника ще е останал с 0 часа работа за деня, а по задачата ще е
	 * останало 3 часа работа. Ако работника има 8 часа, след изпълнението на
	 * метода work() работника ще е останал с 1 час работа за деня, а времето
	 * което остава на задачата да бъде свършена ще е 0.
	 */
	/*
	 * NEWПроменете метода work(), така, че да отговаря на условията описани
	 * по-горе: във всеки един момент всеки работник има 1 текуща задача (ако
	 * няма такава, си взима следващата свободна). Той работи по нея докато не
	 * му свърши времето за деня (края на деня). На другия ден продължава работа
	 * по нея. И така докато не завърши задачата. След това взема следващата
	 * свободна задача. Възможно е да свърши новата задача в рамките на същият
	 * ден, тогава отново си тегли задача. И така това се повтаря, ден след ден,
	 * докато не свършат свободните задачи.
	 */
	public void work() {
		if (currentTask == null) {
			this.setTask();
		}
		while (this.hoursLeft > 0 && currentTask.getWorkingHours() > 0) {
				if (this.hoursLeft > currentTask.getWorkingHours()) {
					this.hoursLeft = this.hoursLeft - currentTask.getWorkingHours();
					currentTask.setWorkingHours(0);
					this.setTask();
					System.out.println("-------------------");
					this.showReport();
				} else {
					currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
					this.hoursLeft = 0;
					System.out.println(this.getName() + " finished today.");
					this.allWork.setCurrentUnassignesTask(this.allWork.getCurrentUnassignesTask() - 1 );
				}
			// if (this.hoursLeft <= 0) {
			// System.out.println("Employees no longer working hours for
			// today!");
			// }
				// if (currentTask.getWorkingHours() <= 0) {
				// System.out.println("The tasks is already completed!");
				// }
			
		}
	}

	/*
	 * Да се направи и метод showReport, който се извиква след като работника
	 * поработи в/у текущата си задача (извикване на work) и показва информация
	 * (принтирайки на конзолата) за: името на работника името на задачата
	 * работните часовете които остават на работника часовете които остават на
	 * текущата задача на работника за да бъде изпълнена
	 */
	public void showReport() {
		System.out.println("Employee name: " + this.name);
		System.out.println("Task: " + this.currentTask.getName());
		System.out.println("Remaining hours of employee: " + this.hoursLeft);
		System.out.println("Remaining hours of current task: " + this.currentTask.getWorkingHours());

	}

	public void setTask() {
		this.currentTask = this.allWork.getNextTask();
	}

	/*
	 * Направете метод на класа Employee startWorkingDay() който просто задава
	 * нови 8 часа за работа на работник (това ще става в началото на всеки ден)
	 */
	public void startWorkingDay() {
		this.setHoursLeft(8);
	}
}
