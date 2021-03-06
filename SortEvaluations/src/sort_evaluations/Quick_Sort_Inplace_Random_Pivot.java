/**
 * Pseudocode:
 * 1. Check for small size array, insertion sort if small enough
 * 2. Choose an element at random in array and use it as pivot
 * 3. Follow quicksort algorithm
 */
package sort_evaluations;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * 
 */
public class Quick_Sort_Inplace_Random_Pivot<Type extends Comparable<? super Type>> extends Quick_Sort<Type> {

	private Random random = new Random();

	/**
	 * Random_Pivot
	 * 
	 * 1) Choose an element at random in the array and use it as pivot 2) Place
	 * this element at array[end]
	 * 
	 * @param array
	 *            = the array with all the data (we sort a sub piece of the
	 *            array)
	 * @param start
	 *            = index of start of array
	 * @param end
	 *            = index of end of array
	 */
	protected Type choose_pivot(ArrayList<Type> array, int start, int end) {
		Sorter.swap(array, start + random.nextInt(end - start), end);
		return array.get(end);
	}

	/**
	 * Name the sort
	 */
	public String name_of_sort() {
		return "Quick Sort Inplace Random Pivot (Cutoff: " +  this.insertionSwitchover + ")";
	}

}
