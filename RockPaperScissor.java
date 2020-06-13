
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//QIBLATAIN FATIMA - 18648
		
		int user_input = Integer.parseInt(args[0]);
		

		double x = Math.random();
		int y = (int)(x * 2) + 1;

		System.out.println("The value computer randomly selected is " + y);
		System.out.println("The value you have selected is " + user_input);
		
		int rock = 0;
		int paper = 1;
		int scissor = 2;
		
		if (user_input >=0 && user_input <=2)	
		{

			
			if (y == rock)
			   System.out.print("The computer is rock. ");
			else if (y == paper)
			   System.out.print("The computer is paper. ");
		    else if (y == scissor)
		       System.out.print("The computer is scissor. ");
			
			if (user_input == rock)
				System.out.print("You are rock. ");
			else if (user_input == paper)
				System.out.print("You are paper. ");
			else if (user_input == scissor)
			    System.out.print("You are scissor. ");
			
			if ((user_input == scissor) && ( y == paper))
				System.out.print("You have won!");
			else if ((user_input == rock) && (y == scissor))
				System.out.print("You have won!");
			else if ((user_input == paper) && (y == rock))
				System.out.print("You have won!");
			else if ((user_input == y))
				System.out.print("It's a draw!");
			else
				System.out.print("You have lost!");
		}
		else 
			System.out.print("The value you have entered is out of range!");
		
	}

}
