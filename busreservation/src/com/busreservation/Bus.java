package com.busreservation;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	Bus(int busno,boolean b,int cap){
		this.busno=busno;
		this.ac=b;
		this.capacity=cap;
	}
	public int busno() {
		return busno;
	}
	public void ac(boolean b) {
		ac=b;
	}
	public boolean isAc() {
		return ac;
	}
	public void cap(int cap) {
		capacity = cap;
	}
	public int capacity() {
		return capacity;
	}


}
