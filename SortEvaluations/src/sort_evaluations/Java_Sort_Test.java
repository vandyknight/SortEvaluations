package sort_evaluations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Java_Sort_Test {

	/**
	 * Test running the sort through the Insertion_Sort class. Simple test case
	 * of small array.
	 */
	@Test
	public void testSort() {
		Java_Sort<Integer> javaSort = new Java_Sort<>();

		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(4);
		intArray.add(7);
		intArray.add(23);
		intArray.add(4);
		intArray.add(8);
		intArray.add(5);

		ArrayList<Integer> intShouldBe = new ArrayList<>();
		intShouldBe.add(4);
		intShouldBe.add(4);
		intShouldBe.add(5);
		intShouldBe.add(7);
		intShouldBe.add(8);
		intShouldBe.add(23);

		javaSort.sort(intArray);
		assertArrayEquals(intShouldBe.toArray(), intArray.toArray());
	}

	/**
	 * Test running of sort w/ a zero array.
	 */
	@Test
	public void testZeroSort() {
		Java_Sort<Integer> javaSort = new Java_Sort<>();

		ArrayList<Integer> intArray = new ArrayList<>();
		ArrayList<Integer> intShouldBe = new ArrayList<>();
		javaSort.sort(intArray);
		assertArrayEquals(intShouldBe.toArray(), intArray.toArray());
	}

}
