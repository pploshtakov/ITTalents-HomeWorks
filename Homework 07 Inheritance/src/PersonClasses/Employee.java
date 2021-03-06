package PersonClasses;

public class Employee extends Person {
	protected double daySalary;

	/*
	 * Конструктор които инициализира всичките му полета (собствени и наследени)
	 */
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		//заплата за 8 часов работен ден
		this.daySalary = daySalary;
		// TODO Auto-generated constructor stub
	}
	/*
	 * Методи: В случай че на работник се наложи да работи извън работно време,
	 * на него му се дължи допълнителна сума пари (overtime) за часовете които е
	 * работил. Сумата се пресмята по следния начин: ако работника, няма
	 * навършени 18 години, дължимата сума е 0. В противен случай, за всеки
	 * отработен час, на работника се заплаща сумата която получава на час
	 * (зависи от дневната заплата) умножена по 1,5. метод
	 * calculateOvertime(double hours) който пресмята и връща стойността на
	 * сумата която му се дължи при работа извън работно време метод
	 * showEmployeeInfo(), който показва информация за човека, както и
	 * информация за дневната му заплата
	 */
	public double calculateOvertime(double hours) {
			if (this.age < 18) {
				System.out.println("The employee should not have overtime.");
				return 0;
			} else {
				return ((this.daySalary/8)*1.5)*hours;
			}
	}
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		super.showPersonInfo();
		System.out.println("Day salary " + this.daySalary);
	}
	
}
