package lesson16homework2;

public class AllWork {
	/*
	 * Да се създаде клас AllWork, които репрезентира множеството от всички
	 * задачи, които трябва да свършат работниците в офиса.
	 */
	private Task[] tasks;
	/*- freePlacesForTasks – числова стойност, която показва колко
	свободни места за нови задачи има в масива (след създаване на обекта
	AllWork, в него няма добавени задачи и тази стойност е 10)
	*/
	private int freePlacesForTasks;
	/*
	 * currentUnassignedTask – указва индекса на текущата свободна(по която
	 * няма работник които да работи) задача. Всяка задача може да бъде давана
	 * на точно 1 работник, които да работи по нея. Когато някои работник си
	 * свърши задачата, той си взима от обекта AllWork първата свободна задача.
	 * Това поле указва индекса на текущата такава задача в масива tasks
	 * (началната му стойност е 0 – първата задача)
	 */
	private int currentUnassignesTask;

	/*
	 * Да се направи констуктор без параметри, който инициализира по подходящ
	 * начин полетата на AllWork
	 */
	public AllWork(int numberOfTasks) {
		this.tasks = new Task[numberOfTasks];
		this.freePlacesForTasks = numberOfTasks;
		this.currentUnassignesTask = 0;
	}

	/* метод addTask, чрез който се добавя задача към множеството от задачи */
	public void addTask(Task t) {
		if (this.freePlacesForTasks > 0) {
			this.tasks[this.tasks.length - this.freePlacesForTasks] = t;
			this.freePlacesForTasks--;
		} else {
			System.out.println("No free places for task!");
		}
	}

	// метод getNextTask който връща следващата незаета задача.
	public Task getNextTask() {
		if (this.currentUnassignesTask < this.tasks.length){
			return this.tasks[this.currentUnassignesTask++];
		} else {
			this.currentUnassignesTask = 0;
			return this.tasks[this.currentUnassignesTask];
		}
		
	}

	public int getCurrentUnassignesTask() {
		return currentUnassignesTask;
	}

	public void setCurrentUnassignesTask(int currentUnassignesTask) {
		this.currentUnassignesTask = currentUnassignesTask;
	}

	// Метод isAllWorkDone, който проверява, дали всички задачи са
	// направени (една задача е направена, ако по нея остават 0 часа работа)
	// Да се спазва принципа за капсулация на данни!!!
	public boolean isAllWorkDone() {
		boolean isAllWorkDone = true;
			for (int i = 0; i < this.tasks.length; i++) {
				if (tasks[i].getWorkingHours() > 0) {
					System.out.println("There is unfinished tasks!");
					return false;
			
				}
			}
			if (isAllWorkDone) {
				System.out.println("All tasks finished.");
			}
		
		return isAllWorkDone;
	}

}
