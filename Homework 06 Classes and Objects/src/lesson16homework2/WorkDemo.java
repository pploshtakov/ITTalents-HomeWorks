package lesson16homework2;

public class WorkDemo {

	public static void main(String[] args) {
		Task monthlyInventory = new Task("monthlyInventory", -5);
		monthlyInventory.setWorkingHours(8);
		System.out.println(monthlyInventory.getName());
		System.out.println(monthlyInventory.getWorkingHours());
		Employee eli = new Employee("");
		eli.setName("Eli");
		eli.setHoursLeft(4);
		eli.setTask(monthlyInventory);
		eli.work();
		eli.work();
		eli.setHoursLeft(6);
		eli.work();
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
