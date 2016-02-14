package test;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import sorting.Insertion;

public class SortInsertionTest {

	@Test
	public void insertionSortShouldSortIntArray() {
		int[] arr = {5, 7, 2, 3, 5};
		int[] expected = {2, 3, 5, 5, 7};
        Insertion.sort(arr);
        assertArrayEquals(expected, arr);
	}
	
	@Test
	public void insertionReverseSortShouldSortIntArray() {
		int[] arr = {5, 7, 2, 3, 5};
		int[] expected = {7, 5, 5, 3, 2};
        Insertion.reverseSort(arr);
        assertArrayEquals(expected, arr);
	}
	
	@Test
	public void insertionSortShouldSortStringArray() {
		String[] arr = {"I", "am", "an", "array", "lol"};
		String[] expected = {"am", "an", "array", "I", "lol"};
		Insertion.sort(arr);
        assertArrayEquals(expected, arr);
	}

	@Test
	public void insertionReverseSortShouldSortStringArray() {
		String[] arr = {"I", "am", "an", "array", "lol"};
		String[] expected = {"lol", "I", "array", "an", "am"};
		Insertion.reverseSort(arr);
        assertArrayEquals(expected, arr);
	}
}





