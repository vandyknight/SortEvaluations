/**
 * @author Roman Clark and Mark Van Der Merwe
 * 
 */
package sort_evaluations;

import java.util.ArrayList;

/**
 * FIXME: put your code to time all of your sorts here.
 * 
 * Pseudocode:
 *     built a list of sorters
 *     add all of the sorts (e.g., Quick_Sort_Naive, Quick_Sort_Inplace...) to the list
 *     for each element of the list
 *        time it for a wide range of values (e.g., 10,000 -> 100,000,000)
 *     test insertion sort separately because you can't wait that long...
 *
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		ArrayList<Sorter<Integer>> sort_methods = new ArrayList<>();
		sort_methods.add(new Insertion_Sort<Integer>());
		sort_methods.add(new Merge_Sort<Integer>());
		sort_methods.add(new Java_Sort<Integer>());
		sort_methods.add(new Quick_Sort_Naive<Integer>());
		sort_methods.add(new Quick_Sort_Inplace_First_Pivot<Integer>());
		sort_methods.add(new Quick_Sort_Inplace_Random_Pivot<Integer>());
		sort_methods.add(new Quick_Sort_Inplace_M3<Integer>());
		// ...
		
	}

}
