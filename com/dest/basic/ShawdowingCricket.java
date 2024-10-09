package com.dest.basic;
class Cricket{
	private String name;
	private int jerseyNo;
	private String nationality;
	private String iplTeam;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIplTeam() {
		return iplTeam;
	}
	public void setIplTeam(String iplTeam) {
		this.iplTeam = iplTeam;
	}
	
	void setData(String name, int jerseyNo, String nationality, String iplTeam ) {
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.nationality = nationality ;
		this.iplTeam = iplTeam;
	}
	void getData() {
		System.out.println(name);
		System.out.println(jerseyNo);
		System.out.println(nationality);
		System.out.println(iplTeam);
	}
	
}
public class ShawdowingCricket {
public static void main(String[] args) {
	Cricket c = new Cricket();
	
	c.setData("M S Dhoni", 7, "Indian", "CSK");
	c.getData();
	
	Cricket c1 = new Cricket();
	c1.setName("Virat");
	c1.setJerseyNo(18);
	c1.setNationality("Indian");
	c1.setIplTeam("RCB");
	System.out.println("========================");
	System.out.println(c1.getName());
	System.out.println(c1.getJerseyNo());
	System.out.println(c1.getNationality());
	System.out.println(c1.getIplTeam());
}
}
