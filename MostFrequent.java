public class MostFrequent {
	
	public static int frequent(int [] a) {
	
		int n = 1000;
		int count = 1;
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count = count + 1;
					{
						if (count > k)
						{
								n = a[i];
						}
						else if (count == k)
						{
							if (n > a[i])
								n = a[i];
						}
							
					}
				}
				
			}
			
			if ( count > k) {
				k = count;
			}
			count = 1;
					
			}
		
		return n;
		}
		

public static void main(String[] args) {
	// TODO Auto-generated method stub

		int [] a = {13, 13, 40, 40, 40, 20, 13, 13, 13, 40, 40, 40};
		System.out.println(frequent(a));
	}

}
