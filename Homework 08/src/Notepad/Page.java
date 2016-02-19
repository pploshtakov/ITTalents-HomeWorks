package Notepad;

public class Page {
	private String title;
	private String text;

	public Page() {
		this.title = "";
		this.text = "";
	}

	public Page(String title, String text) {
		this.setTitle(title);
		this.setText(text);
	}

	private void setText(String text) {
		if (text != null) {
			this.text = text;
		} else {
			System.out.println("Set text again!");
		}
	}

	private void setTitle(String title) {
		if (title != null) {
			this.title = title;
		} else {
			System.out.println("Set title again!");
		}

	}

	// към всяка страница може да се добавя текст
	public void addText(String text) {
		if (this.text == null) {
			this.setText(text);
		} else {
			this.text = this.text + "\n" + text;
		}
	}

	// текста на всяка станица може да бъде изтриван
	public void delText() {
		this.text = null;
	}

	// всяка страница ще може да се преглежда(т.е. метод, който връща
	// String със заглавието и текста на нов ред)
	public void readPage() {
		System.out.println(this.title);
		System.out.println(this.text);
	}

	/*
	 * searchWord(String word) – метода проверява дали думата се съдържа в
	 * текста на страницата
	 */
	public boolean searchWord(String word) {
		String[] sentence = this.text.split(" *(,|=>| ) *");
		for (String word1 : sentence) {
			if (word1.equals(word)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * containsDigits() - метода проверява дали текста на страницата съдържа
	 * числа
	 */
	public boolean containsDegits() {
		String[] chars = this.text.split("");
		for(int i = 0; i < chars.length; i++) {
			if (chars[i].matches("([0-9])")) {
				return true;
			}
		}
		return false;
	}
}
