package com.dest.basic;
class Dog3{
	private String name;
	private String colour;
	private int cost;
	private int age;
	private String breed;
	
	public Dog3() {
		super();

	}
	
	public Dog3(String name) {
		this("tommy","yellow");
		this.name = name;

	}
	public Dog3(String name,String colour) {
		this("rocky","brown",7000);
		this.name = name;
		this.colour = colour;

	}
	public Dog3(String name, String colour, int cost) {
		this("shocky","black",9000,5);
		this.name = name;
		this.colour = colour;
		this.cost = cost;

	}
	public Dog3(String name, String colour, int cost, int age) {
		this("bunty","white",9000,5,"GR");
		this.name = name;
		this.colour = colour;
		this.cost = cost;
		this.age = age;

	}
	public Dog3(String name, String colour, int cost, int age, String breed) {
		this();
		this.name = name;
		this.colour = colour;
		this.cost = cost;
		this.age = age;
		this.breed = breed;

	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	public int getCost() {
		return cost;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}
	
	
	
}
public class Constructors {
public static void main(String[] args) {
	Dog3 d = new Dog3("Vickey");
	System.out.println(d.getName());
	System.out.println(d.getColour());
	System.out.println(d.getCost());
	System.out.println(d.getAge());
	System.out.println(d.getBreed());
}
}
