
public class Mirror {
	
	public static String [] mirror(String [] list){
	    String [] m = new String[2 * list.length];
	    int x = 1;
	    for (int i = 0; i < list.length; i++){
	        m[i] = list[i];
	    }
	    
	    for (int i = m.length/2; i < m.length; i++){
	        m[i] = list[i-x];
	        x+=2;
	    }
	    
	    for (int k = 0; k < m.length; k++){
	        System.out.print(m[k] + " ");
	    } 
	    return m;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] list = {"a","b","c"};
		
		System.out.println(mirror(list));
	}

}
