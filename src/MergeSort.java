import java.util.List;

public class MergeSort {
	
	
	public void mergesort( int [] a, List<Integer> temp) 
	{
		int majtas = 0 ;
		int djathtas = a.length - 1 ;
				
		int mesi = ( majtas + djathtas) /2 ;
		
		mergesort( a,  majtas, djathtas, temp) ;
		
		}
	

	public void mergesort( int [] a, int majtas, int djathtas, List<Integer> temp) 
	{
		
		if( majtas >= djathtas) 
		{
			return ; 
		}
		
		
		int mesi = ( majtas + djathtas) /2 ;
	
		mergesort( a, majtas, mesi, temp) ;
		mergesort( a, mesi + 1 , djathtas, temp) ;
		
		merge ( a, majtas , djathtas , mesi, temp) ;
		
		}
	
		public void merge (int[] a, int majtas , int djathtas , int mesi , List<Integer> temp) 
		{
		
			int left = majtas ;
			int right = mesi + 1 ;
					
			while ( left <= mesi && right <= djathtas )
			{
				
				if( a[ left ] <= a[ right ] ) 
				{
					
					temp.add( a[ left ]) ;
					left++;
				}
				else {
				
					temp.add( a[ right ]) ;
					right++ ;
				}
				
			}
			
			
			for( ; left <= mesi ; left++ ) {
				temp.add( a[ left ]) ;
			}
			
			for( ; right <= djathtas ; right++ ) {
				temp.add( a[ right ]) ;
			}
			
			
			 left = majtas ;
			
			for( int i = 0 ; i < temp.size() ; i++ ) {
				a[ left ] = temp.get( i ) ;
				left++ ;
			}
			
			temp.clear();
		
		}
		
}
