package gasStation;

import java.util.Arrays;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

import vignette.BusVignette;
import vignette.CarVignette;
import vignette.TruckVignette;
import vignette.Vignette;

public class GasStation {
	private int sales;
	private Vignette[] vignettes;
	private Date date = new Date();

	public GasStation() {
		this.sales = 0;
		this.generateRandomVignettes();
		this.sortVignettes();
		// FOR PRINT UNCOMMENT this.printInfoForVignettes();
	}

	public void sortVignettes() {
		// GasStation.quickSort(this.vignettes, 0, this.vignettes.length - 1);
		for (int i = 0; i < vignettes.length; i++) {
			boolean isSorted = true;
			for (int j = 0; j < vignettes.length - 1 - i; j++) {
				if (vignettes[j].getPrice() > vignettes[j + 1].getPrice()) {
					GasStation.swap(vignettes, j, j + 1);
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}

	private void generateRandomVignettes() {
		this.vignettes = new Vignette[10000];
		for (int i = 0; i < vignettes.length; i++) {
			this.vignettes[i] = Vignette.randomVignette();
		}
	}

	public Vignette buyVignette(String typeOfVihecle, String validity) {
		for (int i = 0; i < vignettes.length; i++) {
			if (typeOfVihecle.equals(vignettes[i].getType()) && validity.equals(vignettes[i].getValidity())) {
				Vignette temp = vignettes[i];
				vignettes[i] = Vignette.randomVignette();
				this.sortVignettes();
				temp.setDateOfIssueAndExpiry();
				this.sales += this.vignettes[i].getPrice();
				return temp;
			}
		}
		System.out.println("No vignette of this type.");
		return null;
	}

	public void printInfoForVignettes() {
		for (int i = 0; i < vignettes.length; i++) {
			vignettes[i].printInfo();
		}
	}

	// public static int partition(Vignette[] vignettes, int left, int right) {
	// int pivot = vignettes[right].getPrice();
	// int k = left - 1;
	// for (int i = left; i <= right; i++) {
	// if (vignettes[i].getPrice() <= pivot) {
	// k++;
	// GasStation.swap(vignettes, k, i);
	// }
	// }
	// return k;
	// }
	private static void swap(Vignette[] vignettes, int x, int y) {
		Vignette temp = vignettes[x];
		vignettes[x] = vignettes[y];
		vignettes[y] = temp;
	}

	// public static void quickSort(Vignette[] vignettes, int left, int right) {
	// if (left >= right) {
	// return;
	// }
	// int k = GasStation.partition(vignettes, left, right);
	// GasStation.quickSort(vignettes, left, k - 1);
	// GasStation.quickSort(vignettes, k + 1, right);
	// }
}
