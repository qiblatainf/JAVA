
public class daysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m  = Integer.parseInt(args[0]);
		switch(m)
		{
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
			break;
		case 4: 
			System.out.println("April");
			break;
		case 5: 
			System.out.println("May");
			break;
		case 6: 
			System.out.println("June");
			break;
		case 7: 
			System.out.println("July");
			break;
		case 8: 
			System.out.println("August");
			break;
		case 9: 
			System.out.println("September");
			break;
		case 10: 
			System.out.println("October");
			break;
		case 11: 
			System.out.println("November");
			break;
		case 12: 
			System.out.println("December");
			break;
		}
		
		if (m==4 || m==6 || m==9 || m==11)
			System.out.println("30 days");
		else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10)
			System.out.println("31 days");
		else
			System.out.println("28 days");
	}

}
