package com.pmg.weather;

import java.util.ArrayList;

public class WeatherView {
	public void view(Weather weather) {
		System.out.println("-------------");
		System.out.println("도시 : " + weather.getCity());
		System.out.println("날씨 : " + weather.getState());
		System.out.println("온도 : " + weather.getTem());
		System.out.println("습도 : " + weather.getHum());
		System.out.println("미세먼지 : " + weather.getMise());
	}
	
	public void view(ArrayList<Weather> weathers) {
		for(int i = 0; i < weathers.size(); i++) {
			Weather weather = weathers.get(i);
			this.view(weather);
		}
	}
	
	public void view(String str) {
		System.out.println(str);
	}
}