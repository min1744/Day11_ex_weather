package com.pmg.weather;

public class Weather {
	private String city;//도시
	private String state;//날씨
	private int tem;//온도
	private int hum;//습도
	private double mise;//미세먼지
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getTem() {
		return tem;
	}
	public void setTem(int tem) {
		this.tem = tem;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public double getMise() {
		return mise;
	}
	public void setMise(double mise) {
		this.mise = mise;
	}
	
}