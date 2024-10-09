package com.dest.basic;
class Dog{
	private String name;
	private int age;
	private String colour;
	private int cost;
	private String breed;
	
	void setName(String a) {
		name=a;
	}
	void setAge(int b) {
		age=b;
	}
	void setColour(String c) {
		colour=c;
	}
	void setCost(int d) {
		cost=d;
	}
	void setBreed(String e) {
		breed=e;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getColour() {
		return colour;
	}
	int getCost() {
		return cost;
	}
	String getBreed() {
		return breed;
	}
}

public class Encapulation2 {
public static void main(String[] args) {
	Dog d1 = new Dog();
	d1.setName("Rocky");
	d1.setAge(5);
	d1.setColour("Black");
	d1.setCost(5000);
	d1.setBreed("Husky");
	
	System.out.println(d1.getAge());
	System.out.println(d1.getBreed());
	System.out.println(d1.getColour());
	System.out.println(d1.getCost());
	System.out.println(d1.getName());
}
}
