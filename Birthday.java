
public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int days = Integer.parseInt(args[0]);
		int people = 0;
		boolean[] hasBirthday = new boolean[days];;
		
		while (true)
		{
			int r = (int)(Math.random() * days);
			people = people + 1;
			if (hasBirthday[r])
				break;
				
			hasBirthday[r] = true;
		}
		
		System.out.println(people);
	}

}
