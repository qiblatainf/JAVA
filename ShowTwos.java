
public class ShowTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n = Integer.parseInt(args[0]);
		
		for (int i = 0; i <=n; i++)
		{
			if (n%2 ==0)
			{
				System.out.print("2 * ");
				n =n / 2;
			}
			else
			{
				System.out.println(n);
				break;
			}
		}
	}

}
