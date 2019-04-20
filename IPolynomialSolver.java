/*package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

public class IPolynomialSolver() {
	static DLinkedList A,B,C,R;
	
public static  DLinkedList choose (char poly) {
	DLinkedList n=new DLinkedList();
switch(poly){
	case 'A':n=A; break;
	case 'B':n=B; break;
	case 'C':n=C; break;
	default :System.out.println("error"); break;
	
}
return n;
	
} 
public static void setPolynomial(char poly, int[][] terms) {
	DLinkedList n=choose(poly);
	for(int[] term : terms) {
		n.add(term);
	}
}

/*public static String print(char poly) {
	Dnode n = choose(poly).head;
	int[] tmp = new int[2];
	String m =new String();
	    while(n!=null) {
	    	tmp = (int[])n.data;
	    	if(tmp[0] != 0) {
	    		m+= Integer.toString(tmp[0]) + "x" + "^" + Integer.toString(tmp[1]) + "+";
	    	}
	    }
	    return m;
	}*/