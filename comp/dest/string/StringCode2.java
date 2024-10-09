package comp.dest.string;

public class StringCode2 {
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Rava";
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Adresses are equal");
		}
		else {
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println("Adresses are not equal");
		}
		
		String s3 = new String("Rama");
		String s4= new String("Raba");
		if(s3.compareToIgnoreCase(s2)==0) {
			System.out.println("Adresses are equal");
		}
		else {
			System.out.println(s3.compareToIgnoreCase(s4));
			System.out.println("Adresses are not equal");
		}
	}
}
