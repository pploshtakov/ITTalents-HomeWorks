package Notepad;

public class NotepadDemo {

	public static void main(String[] args) {
//		SecuredNotepad notebook = new SecuredNotepad("notebook",5,"0000");
		SimpleNotepad notebook = new SimpleNotepad("notebook",5);
		notebook.addTextInPage(1, "This is Secure Notepad.");
		notebook.printFromNotepad();
		System.out.println("------------");
		notebook.addNewTextInPage(1, "Any action it wants password!");
		notebook.printFromNotepad();
		System.out.println("------------");
		notebook.delTextInPage(1);
		notebook.printFromNotepad();
		System.out.println("------------");
		notebook.addTextInPage(1, "This is new Secure Notepad");
		notebook.addTextInPage(1, "Any action it wants password!");
		notebook.printFromNotepad();
		System.out.println("------------");
		notebook.addNewTextInPage(2, "The pasword is 0000");
		notebook.printAllPagesWithDigits();
		System.out.println(notebook.searchWord("secure"));
		System.out.println("------------");
		ElectronicSecuredNotepad notepad = new ElectronicSecuredNotepad("notepad", 3, "Asd123");
		notepad.addNewTextInPage(1, "This is Electronic notepad!");
		notepad.start();
		notepad.printFromNotepad();
		notepad.addTextInPage(1, "This is electronic notepad 1!!!");
		notepad.printAllPagesWithDigits();
		System.out.println("------------");
		notepad.stop();
		notepad.printAllPagesWithDigits();
		System.out.println("------------");
		SecuredNotepad secured = SecuredNotepad.createSecuredNotepad("123", 5, "Asd123");
		secured.addNewTextInPage(1, "This is secured notepad with strong pasword!");
		secured.printFromNotepad();

	}

}