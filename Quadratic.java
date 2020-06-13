
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//QIBLATAIN FATIMA - 18648

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		double discriminant = (b*b) - (4 * a * c);
		
		double qformula1 = (-b + Math.sqrt(discriminant))/(2 * a);
		double qformula2 =  (-b - Math.sqrt(discriminant))/(2 * a);
		
		double oneroot = -(double)c/(double)b;
		
		if (a != 0)
		{
			if (discriminant < 0)
				System.out.println("The discriminant is negative!");
			else
				System.out.println("Roots of the equation are " + qformula1 + " and " + qformula2);
		}
		else
			System.out.println("Root of the equation is " + oneroot);
		
	}

}
