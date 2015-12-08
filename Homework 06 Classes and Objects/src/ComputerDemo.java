
public class ComputerDemo {

	public static void main(String[] args) {
		//Да се създадат 2 обекта от тип Computer.
		Computer lenovo = new Computer();
		Computer hp = new Computer();
		/*Да се зададат стойности на всеки от компютрите за year, price,
		hardDiskMemory, freeMemory, operationSystem.*/
		lenovo.year = 2015;
		lenovo.brand = "Lenovo";
		lenovo.price = 999.99;
		lenovo.hardDiskMemory = 1048576;
		lenovo.freeMemory = 2048;
		lenovo.operationSystem = "Windows 7";
		hp.year = 2014;
		hp.brand = "Hulet Parker";
		hp.price = 849.99;
		hp.hardDiskMemory = 512000;
		hp.freeMemory = 1024;
		hp.operationSystem = "Linux";
		/*Нека единият компютър
		да е лаптоп.*/
		lenovo.isNotebook = true;
		/*На единия от двата компютъра да се задели памет 100
		(чрез метода useMemory), а на другия, да се смени операционната
		система (чрез метода changeOperationSystem), след което да се
		изведат на екрана всичките полета на двата компютъра.*/
		hp.useMemory(100);
		lenovo.changeOperationSystem("Windows 8");
		lenovo.printParametersOfComputer();
		System.out.println();
		hp.printParametersOfComputer();
			
		// TODO Auto-generated method stub

	}
	
}