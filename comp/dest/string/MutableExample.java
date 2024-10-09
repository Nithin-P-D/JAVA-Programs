package comp.dest.string;

public class MutableExample {
public static void main(String[] args) {
	String s1 = new String("Nithin");
	String s2 = new String("P D");
	s1 = s1.concat(s2);
	System.out.println(s1);
	
	StringBuffer sb1 = new StringBuffer("Nithin");
	StringBuffer sb2 = new StringBuffer("Appu");
	sb1.append(sb2);
	System.out.println(sb1);
	
	StringBuilder sbl1 = new StringBuilder("Nithin");
	StringBuilder sbl2 = new StringBuilder("Appu");
	sbl1.append(sbl2);
	System.out.println(sbl1);
}
}
