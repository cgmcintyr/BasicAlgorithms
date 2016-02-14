package sorting;

/** 
 * Used to perform selections sorts on given arrays
 * @author Christopher McIntyre (chrsintyre)
 *
 */
public class Selection {
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
}
