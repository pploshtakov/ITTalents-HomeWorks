
public class Computer {
	/*
	 * Задача 1: Създайте клас Computer, който представя компютър. Класът да има
	 * следните полета: year – числова стойност, показваща година на
	 * производство на компютъра price – числова стойност (не е задължително да
	 * е цяло число), показваща цената на компютъра isNotebook – булева стойност
	 * – дали компютъра е преносим или не hardDiskMemory – числова стойност за
	 * размера на хардиска freeMemory – числова стойност, показваща размера на
	 * свободната памет operationSystem – текстово поле за операционната система
	 * на компютъра Класът да дефинира следните методи: -метод
	 * changeOperationSystem(newOperationSystem), който сменя стойността на
	 * полето operationSystem със стойността, подадена като параметър. -метод
	 * useMemory(memory), който намалява свободната памет (freeMemory) със
	 * стойността, подадена като аргумент. Ако стойността на аргумента е
	 * по-голяма от свободната памет, извежда съобщение
	 * "Not enough free memory!" Да се създадат 2 обекта от тип Computer. Да се
	 * зададат стойности на всеки от компютрите за year, price, hardDiskMemory,
	 * freeMemory, operationSystem.Нека единият компютър да е лаптоп. На единия
	 * от двата компютъра да се задели памет 100 (чрез метода useMemory), а на
	 * другия, да се смени операционната система (чрез метода
	 * changeOperationSystem), след което да се изведат на екрана всичките
	 * полета на двата компютъра.
	 */
	// параметри на компютъра
	int year;
	String brand;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	// контруктор по подразбиране Computer() който инициализира полето isNotebook със стойност false
	// и полето operationSystem с "Win XP".
	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	// конструктор с параметри Computer(int year, double price, int hardDiskMemory,
	// int freeMemory), който първо извиква конструктора  по подразбиране и после
	// инициализира останалите полета със стойностите подадени като аргументи.
	Computer(int year, double price, int hardDiskMemory, int freeMemory) {
		this();
		if (year > 1975) {
			this.year = year;
		} else {
			this.year = 1975;
			System.out.println("Please reenter year. Otherwise we will put year default (1975).");
		}
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 0.99;
			System.out.println("Please reenter price. Otherwise we will put price default (0.99$).");
		}
		if (hardDiskMemory >= 32) {
			this.hardDiskMemory = hardDiskMemory;
		} else {
			this.hardDiskMemory = hardDiskMemory;
			System.out.println("Please reenter memory. Otherwise we will put memory default (1024).");
		}
		if (freeMemory <= hardDiskMemory && freeMemory >= 0 ) {
			this.freeMemory = freeMemory;
		} else {
			this.freeMemory = hardDiskMemory;
			System.out.println("No less memory disk . Enter again or leave the value Default (hardDiskMemory).");
		}		
	}
	// констуктор с параметри ,	Computer(int year, double price, int hardDiskMemory, int freeMemory, boolean isNotebook, String operationSystem) 
	// който инициализира всички стойности подадени като аргоменти на конструктора.
	Computer(int year, double price, int hardDiskMemory, int freeMemory, boolean isNotebook, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	// метод int comparePrice(Computer c) , който сравнява цените на два компютъра.
	// ако цената на 1-вия компютър (този, за който се вика метода) е по висока
	// от тази на компютъра подаден като аргумент, метода връща -1.
	// ако е по малка се връща 1, ако са равни - 0
	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
	// сменя операционната система на компютъра
	void changeOperationSystem(String operationSystemIs) {
		operationSystem = operationSystemIs;
	}

	// намалява свободната памет в зависимост от използваната
	void useMemory(int useMemory) {
		if (useMemory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= useMemory;
		}
	}
	void printParametersOfComputer() {
		if (this.isNotebook) {
			System.out.println("Лаптоп.");
		} else {
			System.out.println("Настолен компютър.");
		}
		System.out.println("Марка: " + this.brand);
		System.out.println("Година на производство: " + this.year);
		System.out.println("Хард диск: " + this.hardDiskMemory + "MB");
		System.out.println("Операционна система: " + this.operationSystem);
		System.out.println("Свободна памет: " + this.freeMemory);
		System.out.println("Цена: " + this.price);
	}
}
