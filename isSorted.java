
public class isSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int [] a = new int[args.length];
		boolean isTrue = false;
			
	    for (int i = 0; i < args.length ; i++)
	    {
	    	a[i] = Integer.parseInt( args[i] );
	    }
	    
	    
	    
	    for (int i = 0; i < args.length - 1 ; i++)	
	    {
	    	if (a[i] < a[i+1])
	    	   isTrue = true;
	    	else 
	    		isTrue = false;
	    }
	    System.out.println(isTrue);
	}

}
