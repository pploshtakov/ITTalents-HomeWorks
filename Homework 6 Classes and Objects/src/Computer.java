
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
	boolean isNotebook = false;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

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

}
