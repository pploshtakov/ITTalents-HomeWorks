
public class ComputersDemo {

	public static void main(String[] args) {
		Computer lenovo = new Computer();
		Computer dell = new Computer(2000, 150, 1024, 256);
		Computer acer = new Computer(2005, 555, 2048, 1024, true, "Windows 7"); 
		if (dell.comparePrice(acer) > 0) {
			System.out.println("Acer price is greater than the cost of dell.");
		} else if(dell.comparePrice(acer) < 0) {
			System.out.println("Dell price is greater than the cost of acer.");
		} else {
			System.out.println("Prices are the same.");
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
