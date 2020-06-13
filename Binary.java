
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(args[0]);
		String a = "";
		while (n > 0)
		{
			if (n % 2 == 0)
				a = "0" + a;
			else
			    a = "1" + a;
            n = n/2;

		}
		System.out.println(a);
	}

}
