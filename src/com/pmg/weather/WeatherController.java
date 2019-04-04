package com.pmg.weather;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private Scanner sc;
	private ArrayList<Weather> weathers;
	private WeatherInit wInit;
	private WeatherView view;
	
	public WeatherController() {
		sc = new Scanner(System.in);
		weathers = new ArrayList<Weather>();
		wInit = new WeatherInit();
		view = new WeatherView();
	}
	
	public void start() {
		weathers = wInit.getWeathers();
		while(true) {
			System.out.println("-------------");
			System.out.println("1. 날씨정보 추가");
			System.out.println("2. 날씨정보 검색");
			System.out.println("3. 날씨정보 삭제");
			System.out.println("4. 날씨정보 출력");
			System.out.println("5. 종	     료");
			System.out.println("-------------");
			System.out.print("번호를 입력하세요 : ");
			int select = sc.nextInt();
			if(select == 1) {
				Weather weather = wInit.setWeather();
				weathers.add(weather);
			}else if(select == 2) {
				Weather weather = wInit.findWeather(weathers);
				if(weather != null) {
					view.view(weather);
				}else
					view.view("찾는 도시가 없습니다.");
			}else if(select == 3) {
				String str = wInit.deleteWeather(weathers);
				view.view(str);
			}else if(select == 4) {
				view.view(weathers);
			}else if(select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else
				System.out.println("잘못입력하셨습니다.");
		}
	}
}