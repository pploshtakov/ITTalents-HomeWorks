package Notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean turnedOn;

	public ElectronicSecuredNotepad(String title, int numberOfPages, String pass) {
		super(title, numberOfPages, pass);
	}

	@Override
	public void start() {
		System.out.println("Divace is turned on!");
		turnedOn = true;
	}

	@Override
	public void stop() {
		System.out.println("Divace is turned of!");
		turnedOn = false;
	}

	@Override
	public boolean isStarted() {
		if (!turnedOn) {
			System.out.println("Divace is turned of!");
		}
		return turnedOn;
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted()) {
			super.searchWord(word);
		}
		return turnedOn;

	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()) {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void setNumberOfPages(int numberOfPages) {
		if (isStarted()) {
			super.setNumberOfPages(numberOfPages);
		}
	}

	@Override
	public void addTextInPage(int numberOfPage, String text) {
		if (isStarted()) {
			super.addTextInPage(numberOfPage, text);
		}
	}

	@Override
	public void addNewTextInPage(int numberOfPage, String text) {
		if (isStarted()) {
			super.addNewTextInPage(numberOfPage, text);
		}
	}

	@Override
	public void delTextInPage(int numberOfPage) {
		if (isStarted()) {
			super.delTextInPage(numberOfPage);
		}
	}

	@Override
	public void printFromNotepad() {
		if (isStarted()) {
			super.printFromNotepad();
		}
	}

	@Override
	public void setNewPass(String pass) {
		if (isStarted()) {
			super.setNewPass(pass);
		}
	}

	@Override
	public String getTitle() {
		if (isStarted()) {
			return super.getTitle();
		} else {
			return null;
		}
	}

	@Override
	public void setTitle(String title) {
		if (isStarted()) {
			super.setTitle(title);
		}
	}

}
