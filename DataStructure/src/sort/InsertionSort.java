package sort;

public class InsertionSort {

	/**
	 * This is an implementation of the insertion sort algorithm. In the best case,
	 * the time complexity is O(n), and in the worst case, it is O(n^2).
	 * 
	 * @param arr The array to be sorted.
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			int key = arr[i]; // The element currently being compared.
			int j = i - 1; // The index of the element immediately before the current element.

			while (j >= 0 && key < arr[j]) { // If j is greater than or equal to 0 and the previous element is greater
												// than key
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key; // When key is greater than or equal to arr[j], insert key at the index
								// immediately after arr[j].
		}

	}

	public static void main(String[] args) {

		int[] arr = { 11, 32, 11, 42, 11, 0, 56, 7, 8, 54, 21, 89 };

		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
