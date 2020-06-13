
public class MinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {50,1,7,25,9};
		int min_difference = Integer.MAX_VALUE;
		int x = 0;
		int y = 0;
		
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j=i+1; j < a.length; j++) 
			{
				int difference = Math.abs((a[i] - a[j]));

			    if (difference < min_difference)
			    {
				         min_difference = difference; 
				         x = a[i];
				         y = a[j];
			    }
     
			}
		    
			
		}
		System.out.println(x + " " + y);
	}

}
