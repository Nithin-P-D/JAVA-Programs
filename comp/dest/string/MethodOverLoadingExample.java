package comp.dest.string;
class Calculation{
	int add (int a, int b) {
		return a+b;
	}
	int add (int a, int b, int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
}
public class MethodOverLoadingExample {
public static void main(String[] args) {
	Calculation c = new Calculation();
	System.out.println(c.add(20.5f, 0.66f));
}
}
