
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numberofinputs = Integer.parseInt(args[0]);
		int numbers = Integer.parseInt(args[1]);
		
		
		for (int i = 0; i < numberofinputs; i++)
		{
			int r = (int)(Math.random() * numbers);
		}
			
	}

}
