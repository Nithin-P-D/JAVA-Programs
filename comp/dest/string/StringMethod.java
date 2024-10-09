package comp.dest.string;

public class StringMethod {
public static void main(String[] args) {
	String s1 = "arunKumarSanganal";
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.startsWith("kumar"));
	System.out.println(s1.replace('a', '*'));
	System.out.println(s1.hashCode());
	System.out.println(s1.charAt(5));
}
}