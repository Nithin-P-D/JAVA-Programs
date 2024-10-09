package com.dest.basic;
class Dog{
	private String name;
	private int age;
	private String colour;
	private int cost;
	private String breed;
	
	void setData(String a, int b, String c, int d, String e) {
		name = a;
		age = b;
		colour = c;
		cost = d;
		breed = e;
	}
	
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(colour);
		System.out.println(cost);
		System.out.println(breed);
		
	}
}
public class Encapusulation1 {
public static void main(String[] args) {
	Dog d = new Dog();
	d.setData("Rocky", 5, "Black", 5000, "Pug");
	d.getData();
}
}
