package comp.dest.variable;
class Sample{
	int a,b,c;
	static int p,q,r;
	static {
		p = 10;
		q = 20;
		r = 30;
	}
	{
		a = 100;
		b = 200;
		c = 300;
}
	static void displayStatic() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
	void displayNonStatic() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
}

public class variable {
	public static void main(String[] args) {
		Sample.displayStatic();
		Sample s = new Sample();
		s.displayNonStatic();
	}

}
