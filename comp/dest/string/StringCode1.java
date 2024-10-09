package comp.dest.string;

public class StringCode1 {
public static void main(String[] args) {
	String s1 = "rama";
	String s2 = "rama";
	if(s1==s2) {
		System.out.println("Adresses are equal");
	}
	else {
		System.out.println("Adresses are not equal");
	}
	String s3 = new String("rama");
	String s4= new String("rama");
	if(s3==s4) {
		System.out.println("Adresses are equal");
	}
	else {
		System.out.println("Adresses are not equal");
	}
}
}
