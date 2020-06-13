
public class ETriangle {

	public static void triangle(int x, int y, int s) {
		
		StdDraw.line( x, y+ Math.sqrt(3)/2*s,x-s/2, y- Math.sqrt(3)/6*s);
		StdDraw.line(x-s/2, y- Math.sqrt(3)/6*s,x+s/2, y- Math.sqrt(3)/6*s);
		StdDraw.line(x, y+ Math.sqrt(3)/2*s, x+s/2, y- Math.sqrt(3)/6*s);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.setXscale(0, 50);
		StdDraw.setYscale(0, 50);
		
	    triangle(25, 25, 25);
		
	    

	}

}
