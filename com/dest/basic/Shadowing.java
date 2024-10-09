package com.dest.basic;
class Dog1{
	private String name;
	private int age;
	private String colour;
	private int cost;
	private String breed;
	
	void setData(String name, int age, String colour, int cost, String breed) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.cost = cost;
		this.breed = breed;
	}
	
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(colour);
		System.out.println(cost);
		System.out.println(breed);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class Shadowing {
public static void main(String[] args) {
	Dog1 d1 = new Dog1();
	d1.setData("Tommy", 5, "white", 5000, "pug");
	d1.getData();
	
	Dog1 d2 = new Dog1();
	d2.setName("Rocky");
	d2.setAge(5);
	d2.setColour("Brown");
	d2.setCost(5000);
	d2.setBreed("GR");
	System.out.println("=================================");
	System.out.println(d2.getName());
	System.out.println(d2.getAge());
	System.out.println(d2.getColour());
	System.out.println(d2.getCost());
	System.out.println(d2.getBreed());
}
}
