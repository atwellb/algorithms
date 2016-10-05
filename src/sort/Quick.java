package sort;

public class Quick {

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int s, int e) {
		if (s < e) {
			int p_index = partition(arr, s, e);
			sort(arr, s, p_index - 1);
			sort(arr, p_index + 1, e);
		}
	}

	private static int partition(int[] arr, int s, int e) {
		int partition = arr[e]; // last element
		int swap = s;
		for (int i = s; i < e; i++) {
			// swap everything less than partition into swap
			if (arr[i] < partition) {
				swap(arr, i, swap);
				swap++;
			}
		}
		// swap partition right behind the "low" section
		swap(arr, swap, e);
		return swap;
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
