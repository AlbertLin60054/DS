package sort;

public class SelectionSort {

	/**
	 * This is a selection sort algorithm. In both the best and worst cases, the time complexity is O(n^2).
	 * @param arr The array to be sorted.
	 */
	public static void selectionSort(int[] arr) {
		// The outer loop iterates through each element of the array, assuming the current element is the index of the minimum value.
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			// The inner loop checks if there is any element smaller than the current element after the index i. If so, it updates the index of the minimum value.
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// If the index of the minimum value has changed, swap the values at the current index i and the minimum index.
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 45, 7, 8, 97, 4, 2, 45 };

		selectionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
