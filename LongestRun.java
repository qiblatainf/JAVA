import java.util.Scanner;

public class LongestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the total numbers you are going to enter: ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] x = new int[n + 1];

		
		int count = 1;
		int max = 1;
		int num = 0; 
		
		for (int i =1; i <= n; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++)
		{
			if (x[i] == x[i-1] )
			{

				count = count + 1;
				if(count>max) {
					max = count;
					num = x[i];
				}
			
			}
			else
				count = 1;
		}

		System.out.println(max + " consecutive " + num + "s");


	}

}
