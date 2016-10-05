import sorting.Insertion;
import sorting.Quick;

public class App {

	public static void main(String[] args) {
		int[] src = {4, 7, 6, 9, 3, 2, 1, 8, 5, 14, 9, 3, 12, 13};

		int[] i_arr = new int[src.length];
		System.arraycopy(src, 0, i_arr, 0, src.length);
		Insertion.sort(i_arr);
		print(i_arr);

		int[] q_arr = new int[src.length];
		System.arraycopy(src, 0, q_arr, 0, src.length);
		Quick.sort(q_arr);
		print(q_arr);

		int[] m_arr = new int[src.length];
		System.arraycopy(src, 0, m_arr, 0, src.length);
		
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
