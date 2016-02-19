package Notepad;

public class SimpleNotepad implements INotepad {
	private String title;
	private Page[] pages;

	public SimpleNotepad(String title, int numberOfPages) {
		this.chechTitle(title);
		this.chechNumberOfPages(numberOfPages);
		this.createEmptyPages();
	}

	public void setTitle(String title) {
		this.chechTitle(title);

	}
	private void chechTitle(String title2) {
		if (title != null) {
			this.title = title;
		} else {
			System.out.println("If you do not enter a title , will put such a default - notepad");
			this.title = "Notepad";
		}		
	}

	public String getTitle() {
		return title;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.chechNumberOfPages(numberOfPages);
	}
	
	

	public void addTextInPage(int numberOfPage, String text) {
		if (numberOfPage > 0) {
			this.pages[numberOfPage - 1].addText(text);
		} else {
			System.out.println("No such page!");
		}
	}

	public void addNewTextInPage(int numberOfPage, String text) {
		if (numberOfPage > 0) {
			this.pages[numberOfPage - 1].delText();
			this.pages[numberOfPage - 1].addText(text);
		} else {
			System.out.println("No such page!");
		}
	}

	public void delTextInPage(int numberOfPage) {
		if (numberOfPage > 0) {
			this.pages[numberOfPage - 1].delText();
		} else {
			System.out.println("No such page!");
		}
	}

	@Override
	public void printFromNotepad() {
		for (int i = 0; i < pages.length; i++) {
			this.pages[i].readPage();
		}
	}
	private void createEmptyPages() {
		for(int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
		}
	}
	
	private void chechNumberOfPages(int numberOfPages) {
		if (numberOfPages > 0) {
			this.pages = new Page[numberOfPages];
		} else {
			System.out.println("Set the number of pages , or set the default - 10!");
			this.pages = new Page[10];
		}
	}

	@Override
	public boolean searchWord(String word) {
		for(int i = 0; i < this.pages.length; i++) {
			return this.pages[i].searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i = 0; i < this.pages.length; i++) {
			if (this.pages[i].containsDegits()) {
				this.pages[i].readPage();
			}
		}
	}

}