package test;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import sorting.Selection;

public class SortTest {

	@Test
	public void selectionSortShouldSortIntArray() {
		int[] arr = {5, 7, 2, 3, 5};
		int[] expected = {2, 3, 5, 5, 7};
        Selection.sort(arr);
        assertArrayEquals(expected, arr);
	}
	
	@Test
	public void selectionReverseSortShouldSortIntArray() {
		int[] arr = {5, 7, 2, 3, 5};
		int[] expected = {7, 5, 5, 3, 2};
        Selection.reverseSort(arr);
        assertArrayEquals(expected, arr);
	}
	
	@Test
	public void selectionSortShouldSortStringArray() {
		String[] arr = {"I", "am", "an", "array", "lol"};
		String[] expected = {"am", "an", "array", "I", "lol"};
		Selection.sort(arr);
        assertArrayEquals(expected, arr);
	}

	@Test
	public void selectionReverseSortShouldSortStringArray() {
		String[] arr = {"I", "am", "an", "array", "lol"};
		String[] expected = {"lol", "I", "array", "an", "am"};
		Selection.reverseSort(arr);
        assertArrayEquals(expected, arr);
	}
}





