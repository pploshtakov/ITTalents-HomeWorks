public class Task04 {
	/*
	 * Напишете програма, която сортира (подрежда елементите във възходящ ред)
	 * масив, съдържащ само 0 и 1.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1 };
		sortArr(arr);
		// TODO Auto-generated method stub

	}

	static void sortArr(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < count) {
				if (i == 0) {
					System.out.print("[" + 0 + ",");
				} else {
					System.out.print(0 + ",");
				}
			} else {
				if (i == arr.length - 1) {
					System.out.print(1 + "]");
				} else {
					System.out.print(1 + ",");
				}
			}
		}
	}
}
