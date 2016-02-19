package Notepad;

public interface INotepad {
	// Добавя даден текст към страница с определен номер
	public void addTextInPage(int numberOfPage, String text);

	// Добавя даден текст върху страница с определен номер (изтрива
	// предишния и записва новия)
	public void addNewTextInPage(int numberOfPage, String text);

	// Да трие текста от дадена страница
	public void delTextInPage(int numberOfPage);

	/*
	 * Да преглежда всички страници (да принтира на конзолата заглавието и
	 * текста)
	 */
	public void printFromNotepad();

	/*
	 * searchWord(String word) – проверява дали в някоя страница на бележника се
	 * съдържа думата word
	 */
	public boolean searchWord(String word);
	/*
	 * printAllPagesWithDigits() - метода извежда на екрана съдържанието на
	 * всички страници които съдържат цифри
	 */
	public void printAllPagesWithDigits();

}
