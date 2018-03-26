package com.santander.demo.model;

public class Card {

	private long number;
	private String type;
	private int venc;
	private int cvv;
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVenc() {
		return venc;
	}
	public void setVenc(int venc) {
		this.venc = venc;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
}
