
public class yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[5];
		
		boolean isYahtzee = false;
		
		
		for (int i = 0; i < a.length; i++)
		{
			int r = (int)((Math.random() * 7) + 1);
			a[i] = r;
			System.out.print(a[i] + " ");
			
		}
		
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] == a[i-1])
				isYahtzee = true;
			else 
				isYahtzee = false;
			
		}
		if (isYahtzee == true)
			System.out.println("Yahtzee!");
		else
			System.out.println("Try again!");
				
	}

}
