package com.pmg.weather;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherInit {
	private Scanner sc;
	private String info;

	public WeatherInit() {
		sc = new Scanner(System.in);
		info = "seoul, 맑음, 10, 20, 0.3, daejon, 비, 22, 50, 0.1,"
				+ "incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";
	}

	public ArrayList<Weather> getWeathers() {
		ArrayList<Weather> weathers = new ArrayList<Weather>();
		info = info.replace("-", "");
		StringTokenizer st = new StringTokenizer(info, ",");
		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken().trim());
			weather.setState(st.nextToken().trim());
			weather.setTem(Integer.parseInt(st.nextToken().trim()));
			weather.setHum(Integer.parseInt(st.nextToken().trim()));
			weather.setMise(Double.parseDouble(st.nextToken().trim()));
			weathers.add(weather);
		}
		/*String [] infos = info.split(",");
		for(int i = 0; i < infos.length; i++) {
			Weather weather = new Weather();
			weather.setCity(infos[i].trim());
			weather.setState(infos[++i].trim());
			weather.setTem(Integer.parseInt(infos[++i].trim()));
			weather.setHum(Integer.parseInt(infos[++i].trim()));
			weather.setMise(Double.parseDouble(infos[++i].trim()));
			weathers.add(weather);
		}*/
		return weathers;
	}

	public Weather setWeather() {
		Weather weather = new Weather();
		System.out.print("도시 : ");
		weather.setCity(sc.next());//도시
		System.out.print("날씨 : ");
		weather.setState(sc.next());//날씨
		System.out.print("온도 : ");
		weather.setTem(sc.nextInt());//온도
		System.out.print("습도 : ");
		weather.setHum(sc.nextInt());//습도
		System.out.print("미세먼지 : ");
		weather.setMise(sc.nextDouble());//미세먼지
		
		return weather;
	}
	
	public Weather findWeather(ArrayList<Weather> weathers) {
		Weather weather = null;
		System.out.print("도시명 입력 : ");
		String city = sc.next();
		for(int i = 0; i < weathers.size(); i++) {
			weather = weathers.get(i);
			if(weather.getCity().equals(city)) {
				weather = weathers.get(i);
				break;
			}
		}
		return weather;
	}
	
	public String deleteWeather(ArrayList<Weather> weathers) {
		System.out.print("삭제할 도시명을 입력하세요 : ");
		String city = sc.next();
		String result = "없는 도시입니다.";
		for(int i = 0; i < weathers.size(); i++) {
			if(weathers.get(i).getCity().equals(city)) {
				weathers.remove(i);
				result = "삭제가 완료되었습니다.";
				break;
			}
		}
		return result;
	}
}