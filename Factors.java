
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		long n = Long.parseLong(args[0]);
	    for ( long i = 2; i <= n/i; i++)
	    {	
	    	while (n % i == 0) 
	    	{
	    		System.out.println(i + " ");
	    		n = n/i;
	    	}
	    }
		 
	    if (n>1)
			 System.out.println(n);
		 else System.out.println();
	    
	
	}

}
