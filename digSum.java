
public class digSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(args[0]);
		int sum = 0;
	
		
		while ( n != 0)
		{
			if (n < 0)
				n = n * -1;
			
			int remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;		
			
		}
		System.out.println(sum);
	}

}
