public class BalanceArray {
	
		public static boolean canBalance(int[] a) {
			int sumL = 0;
			int sumR = 0;
			for(int i=0; i<a.length; i++)
			{
			 sumL = sumL + a[i];
				for(int j=a.length - 1; j > 0; j--) 
				{
					sumR = sumR +a[j];
					if ( sumL == sumR) {
						return true;
							
					}
				}
			}
			return false;
		}
		
		 public static void main(String[] args) {
		        int[] a = {2, 1, 1, 2, 1};  
		        System.out.println(canBalance (a));  
		 } 
	


}
