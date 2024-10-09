package comp.dest.variable;

import java.util.Scanner;

class Farmer{
	double principle;
	double time;
	static double rate;
	double simple_intrest;
	static {
		rate=6.876;
	}
	void collectData(){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the principle");
		principle = sc.nextDouble();
		System.out.println("enter the time");
		time = sc.nextDouble();
		}
	void calculate() {
		simple_intrest = (principle*time*rate)/100;
	}
	void display() {
		System.out.println("the simple intrest is :"+simple_intrest);
	}
}
class Program{
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("-------");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("-----");
		f3.collectData();
		f3.calculate();
		f3.display();
		
		
	}
}
