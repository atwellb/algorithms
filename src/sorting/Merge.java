package sorting;

public class Merge {

	public static void sort(int[] a) {
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		sort(a, b, 0, a.length);
	}

	private static void sort(int[] a, int[] b, int s, int e) {
		if (e - s > 1) {
			int mid = (e + s) / 2;
			// sort a into b
			sort(b, a, s, mid);
			sort(b, a, mid, e);
			// b is now sorted in both halves
			// merge b back into a
			merge(a, b, s, mid, e);
		}
	}

	private static void merge(int[] a, int[] b, int s, int mid, int e) {
		int l_i = s;	// low
		int h_i = mid;	// high
		int k = s;
		while (k < e) {
			// items left in a AND (no items left in b or a < b)
			if (l_i < mid && (h_i == e || b[l_i] < b[h_i])) {
				a[k] = b[l_i];
				l_i++;
			} else {
				a[k] = b[h_i];
				h_i++;
			}
			k++;
		}
	}

//	public static void sort2(int[] arr) {
//		if (arr.length > 1) {
//			int mid = arr.length / 2;
//			int[] a = new int[mid];
//			int[] b = new int[arr.length - mid];
//			System.arraycopy(arr, 0, a, 0, mid);
//			System.arraycopy(arr, mid, b, 0, arr.length - mid);
//			sort2(a);
//			sort2(b);
//	
//			merge2(arr, a, b);
//		}
//	}
//
//	private static void merge2(int[] arr, int[] a, int[] b) {
//		int a_i = 0;
//		int b_i = 0;
//		int k = 0;
//		while (a_i < a.length && b_i < b.length) {
//			if (a[a_i] < b[b_i]) {
//				arr[k] = a[a_i];
//				a_i++;
//			} else {
//				arr[k] = b[b_i];
//				b_i++;
//			}
//			k++;
//		}
//		while (a_i < a.length) {
//			arr[k] = a[a_i];
//			a_i++;
//			k++;
//		}
//		while (b_i < b.length) {
//			arr[k] = b[b_i];
//			b_i++;
//			k++;
//		}
//	}
}
