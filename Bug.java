public class Bug {

	private int position;
	int x = 1;
	
	public Bug(int initialPosition) {
		position = initialPosition;
	}
	
	public void move() {
		position += x;
	}
	
	public void turn() {
		if (x == 1) x = -1;
		else x = 1;
		
	}
	
	public int getPosition() {
		int current_position = position;
		return current_position;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bug bugsy = new Bug(10);
		bugsy.move();
		bugsy.turn();
		bugsy.move();
		System.out.println(bugsy.position);
	}

}
