
public class Vector {
	private final double x, y, z;
	
	public Vector(double x0, double y0, double z0) {
		x = x0;
		y = y0;
		z = z0;
	}
	
	public double dot(Vector that) {
		return (this.x*that.x + this.y*that.y + this.z*that.z);
	}
	
	public Vector add(Vector that) {
		double xx = this.x + that.x;
		double yy = this.y + that.y;
		double zz = this.z + that.z;
		return(new Vector(xx, yy, zz));
	}
	
	public String toString() {
		return "(" + x + " " + y + " " + z + ")";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector(2.0, 3.0, 4.0);
		System.out.println(v.dot(new Vector(3.0, 2.0, 1.0)));
		System.out.println(v.add(new Vector(3.0, 2.0, 1.0)));
	}

}

