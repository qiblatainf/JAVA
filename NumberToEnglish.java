
public class NumberToEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//QIBLATAIN FATIMA - 18648
		
		//taking inputs and assigning variables
		int numtowords = Integer.parseInt(args[0]);
		System.out.println("Number to be converted into words: " + numtowords);
		int num_length = 0;
		String fourdgt="";
		String threedgt="";
		String twodgt="";
		String onedgt="";
		
		//determining the sign 
		String sign;
		if ( numtowords < 0 )
		{
			numtowords = numtowords * -1;
			sign= "negative ";
		}
		else 
			sign= "";
	
		//determining the length of the number
		{		
		if ((numtowords >= 0) && (numtowords <= 9))
			num_length = 1;
		else if ((numtowords >= 10) && (numtowords <= 99))
			num_length = 2;
		else if ((numtowords >= 100) && (numtowords <= 999))
			num_length = 3;
        else if ((numtowords >= 1000) && (numtowords <= 9999))
			num_length = 4;
		System.out.println("The length of the input is " + num_length);
		
		if (num_length < 1 || num_length > 4)
			System.out.println("The length of the input is out of range");
		}

		//number is 0
		String zero = "zero";
		
		//numbers from 1 to 9
		String [] singledigit ={"","one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
		
		//numbers from 11 to 19
		String [] doubledigits1 = {"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
		
		//numbers divisible by 10
		String [] doubledigits2 = {"ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};

		
		//converting 0 to words
		if ( numtowords == 0)
			System.out.print(zero);

        //converting rest of the numbers to words
    	for (int i = 0; i < num_length; i++)
    	{
    		if (num_length == 4 )
    		{
    			int q = numtowords / 1000;
    			numtowords = numtowords - ( q * 1000);
    			fourdgt=singledigit[q] + "thousand ";
    			
    	    			
    	        if (numtowords > 9)
    	        	num_length = num_length - 1;
    	        else 
    	        	num_length = num_length -3;
    		}
    		
    	    if (num_length == 3)
    	    {
    	    	int q = numtowords / 100;
    	       	threedgt=singledigit[q] + "hundred ";
    	    	numtowords = numtowords - ( q * 100);
    	        if (numtowords > 9)
    	        	num_length = num_length - 1;
    	        else 
    	        	num_length = num_length -2;	
    	    }

    	    if (num_length == 2 )
		    {
    	    	if (numtowords >= 11 && numtowords <= 19)
    	    	{
    	        	numtowords =numtowords-11 ;
    	        	twodgt= doubledigits1[numtowords];
    	    		num_length = num_length - 2;
    	    	}
    	    	else if (numtowords%10== 0)
    	    	{
    	    		numtowords = (numtowords / 10)-1 ;
    	    		twodgt= doubledigits2[numtowords];
    	    		num_length = num_length - 2;
    	    	}
    	    	else if (numtowords%10!= 0)

    	    	{
    	    		
    	    		int q = numtowords/10;
            		twodgt = doubledigits2[q-1] ;
            		num_length = num_length - 1;
    	    	}	
		    }
    	    
    	    if (num_length == 1 )
		    {
    	    	int r = numtowords % 10;
    	    	onedgt=singledigit[r];
		    }
    	     
    	    //printing the output 
    	    System.out.print("Number converted to words: " + sign + fourdgt + threedgt + twodgt + onedgt);
    	}    	    

     	
	}
	

}