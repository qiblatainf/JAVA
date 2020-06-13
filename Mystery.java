
public class Mystery {

	public static void mystery1(int n) {
		if (n <= 1) {
		System.out.print(n);
		} else {
		mystery1(n / 2);
		System.out.print(", " + n);
		}
		}

	public static void main(String[] args) {

		int n = 20;
		mystery1(n);
	}

}
