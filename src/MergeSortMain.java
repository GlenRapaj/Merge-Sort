import java.util.ArrayList;
import java.util.List;

public class MergeSortMain {

	public static void main(String[] args) {
		
		int [] a = {  4, 2, 7, 8, 3, 6, 5, 5, 1 } ;  
		List<Integer> temp = new ArrayList<Integer>() ;
		
		MergeSort mergeSort = new MergeSort() ;
		mergeSort.mergesort(  a, temp ) ;
		
		for( int i = 0 ; i < a.length ; i++ ) {
			System.out.println( a[ i ] );
		}

	}

}
