package sorting;

/** 
 * Sorts arrays using selection sort
 * 
 * @author Christopher McIntyre (chrsintyre)
 */
public class Selection {
	/**
	 * Sorts array of integers lowest to highest
	 * @param arr array to be sorted
	 */
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++){
			int key = arr[i];
			for (int j=i-1; j>=0; j--) {
				if (key < arr[j]) {
					arr[j+1] = arr[j];
					arr[j] = key;
				} else {
					break;
				}
			}
		}
	}
	
	/**
	 * Sorts array of integers highest to lowest
	 * @param arr array to be sorted
	 */
	public static void reverseSort(int[] arr) {
		for (int i = 1; i < arr.length; i++){
			int key = arr[i];
			for (int j=i-1; j>=0; j--) {
				if (key > arr[j]) {
					arr[j+1] = arr[j];
					arr[j] = key;
				} else {
					break;
				}
			}
		}
	}
	
	/**
	 * Sorts array of strings lexicographically, ignoring case differences
	 * @param arr String array to be sorted
	 */
	public static void sort(String[] arr) {
		for (int i = 1; i < arr.length; i++){
			String key = arr[i];
			for (int j=i-1; j>=0; j--) {
				if (key.compareToIgnoreCase(arr[j]) < 0) {
					arr[j+1] = arr[j];
					arr[j] = key;
				} else {
					break;
				}
			}
		}
	}
	
	/**
	 * Sorts array of strings in reverse lexicographically, ignoring case 
	 * differences.
	 * @param arr String array to be sorted
	 */
	public static void reverseSort(String[] arr) {
		for (int i = 1; i < arr.length; i++){
			String key = arr[i];
			for (int j=i-1; j>=0; j--) {
				if (key.compareToIgnoreCase(arr[j]) > 0) {
					arr[j+1] = arr[j];
					arr[j] = key;
				} else {
					break;
				}
			}
		}
	}
}
