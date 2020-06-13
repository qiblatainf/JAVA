
public class EqualAndSamArray {

	public static boolean eq(int [] a, int [] b) {
	
	if (a.length == b.length)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i])
				return false;
		}
		return true;
		
	}
	else 
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] c = {1, 2, 3, 4}; 
		int [] d = {1, 2, 3, 4};
		System.out.println(eq(c , d));
		
	}

}
