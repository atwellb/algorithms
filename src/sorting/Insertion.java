package sorting;

public class Insertion {

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
				j--;
			}
		}
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
