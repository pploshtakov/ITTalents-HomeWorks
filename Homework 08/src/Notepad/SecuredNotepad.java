package Notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String pass;

	protected SecuredNotepad(String title, int numberOfPages, String pass) {
		super(title, numberOfPages);
		this.setPass(pass);
	}

	public static SecuredNotepad createSecuredNotepad(String title, int numberOfPages, String pass) {
		if (validatePass(pass)) {
			return new SecuredNotepad(title, numberOfPages, pass);
		} else {
			return null;
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (this.checkPass()) {
			return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.checkPass()) {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void setNumberOfPages(int numberOfPages) {
		if (this.checkPass()) {
			super.setNumberOfPages(numberOfPages);
		}
	}

	@Override
	public void addTextInPage(int numberOfPage, String text) {
		if (this.checkPass()) {
			super.addTextInPage(numberOfPage, text);
		}
	}

	@Override
	public void addNewTextInPage(int numberOfPage, String text) {
		if (this.checkPass()) {
			super.addNewTextInPage(numberOfPage, text);
		}
	}

	@Override
	public void delTextInPage(int numberOfPage) {
		if (this.checkPass()) {
			super.delTextInPage(numberOfPage);
		}
	}

	@Override
	public void printFromNotepad() {
		if (this.checkPass()) {
			super.printFromNotepad();
		}
	}

	private void setPass(String pass) {
		if (validatePass(pass)) {
			this.pass = pass;
		} else {
			System.out.println("Pasword reqired least five symbols, a-z, A-Z, 0 - 9! ");
		}
	}

	private static boolean validatePass(String pass) {
		if (pass.matches("^.*(?=.{5,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$")) {
			return true;
		} else {
			return false;
		}
	}

	public void setNewPass(String pass) {
		if (this.checkPass()) {
			this.pass = pass;
		}
	}

	@Override
	public String getTitle() {
		if (this.checkPass()) {
			return super.getTitle();
		} else {
			return null;
		}
	}

	@Override
	public void setTitle(String title) {
		if (this.checkPass()) {
			super.setTitle(title);
		}
	}

	Scanner sc = new Scanner(System.in);

	private boolean checkPass() {
		System.out.println("Plase enter a pasword!");
		String pass = sc.nextLine();
		if (!this.pass.equals(pass)) {
			System.out.println("Wrong pass!");
		}
		return this.pass.equals(pass);
	}

}
