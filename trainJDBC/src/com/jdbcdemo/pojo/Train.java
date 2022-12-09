package com.jdbcdemo.pojo;

public class Train {

	private int trainno;
	private String tname;
	private int fare;
	
	//constructor - table name
	public Train() {
	}

	//getters & setters
	public int getTrainno() {
		return trainno;
	}

	public String getTname() {
		return tname;
	}

	public int getFare() {
		return fare;
	}

	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	//overriding the toString() method to display the o/p we want
	@Override
	public String toString() {
		return "trainno=" + trainno + ", tname=" + tname + ", fare=" + fare;
	}
	
}
