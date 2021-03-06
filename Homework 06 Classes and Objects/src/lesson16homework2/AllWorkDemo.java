package lesson16homework2;

public class AllWorkDemo {
	/*
	 * Да се създаде програма в която се създава обект от клас AllWork, който се
	 * запълва със задачи(10-12 задачи) с различно време. Да се създадът и
	 * няколко (3-4) работника. В един безкраен цикъл, да се даде старт на
	 * работата и всички работници да започнат да си теглят задачи и да работят
	 * по тях. Всяка итерация на цикъла е 1 ден в офиса и приключва когато
	 * всичките работници си изработят 8те часа за деня. Методите в класа
	 * Employee да се допълнят с подходящи съобщения, така че да се извеждат
	 * съобщения при всяко действие от страна на някой работник (взимане на нова
	 * задача, работене по текущата задача), за начало на нов работен ден и
	 * всичко необходимо за да се проследи изпълнението на програмата. След като
	 * се стартира програмата, да започнат да текът дните, всички работници
	 * трябва да започват да работят и да се извежда съобщение за това в кой
	 * ден, кой работник какво да прави.
	 */

	public static void main(String[] args) {
		/*
		 * Да се създаде програма в която се създава обект от клас AllWork,
		 * който се запълва със задачи(10-12 задачи) с различно време.
		 */
		AllWork allWorks = new AllWork(10);
		Task monthlyInventory = new Task("monthlyInventory", 12);
		allWorks.addTask(monthlyInventory);
		Task orders = new Task("orders", 15);
		allWorks.addTask(orders);
		Task cleaning = new Task("cleaning", 12);
		allWorks.addTask(cleaning);
		Task planningMonth = new Task("planningMonth", 10);
		allWorks.addTask(planningMonth);
		Task sells = new Task("sells", 8);
		allWorks.addTask(sells);
		Task acceptOrder = new Task("acceptOrder", 4);
		allWorks.addTask(acceptOrder);
		Task rest = new Task("rest", 2);
		allWorks.addTask(rest);
		Task cooking = new Task("cooking", 10);
		allWorks.addTask(cooking);
		Task dailyReport = new Task("dailyReport", 2);
		allWorks.addTask(dailyReport);
		Task montlyReport = new Task("montlyReport", 6);
		allWorks.addTask(montlyReport);
		/*
		 * Да се създадът и няколко (3-4) работника.
		 */
		Employee emo = new Employee("Emo", allWorks);
		Employee liubo = new Employee("Liubo", allWorks);
		Employee rumen = new Employee("Rumen", allWorks);
		Employee[] workers = {emo, liubo, rumen};
		int day = 0;
		while(true) {
			System.out.println("Start day " + (++day));
			workingDay(workers);
			System.out.println("Finished day " + day);
			if (allWorks.isAllWorkDone()){
				break;
			}
		}
		// TODO Auto-generated method stub
	
	}
	static void workingDay(Employee[] workers) {
		newWorkingDay(workers);
		for (int i = 0; i < workers.length; i++) {
			workers[i].work();
		}
	}
	static void newWorkingDay(Employee[] workers) {
		for (int i = 0; i < workers.length; i++) {
			workers[i].startWorkingDay();
		}
		
	}

}
