package uk.ac.belfastmet.event.domain;

public class Data {

	private AllEvents location;
	private Weather weather;
	
	
	
	public Data() {
		super();
	}


	public Data(AllEvents location, Weather weather) {
		super();
		this.location = location;
		this.weather = weather;
	}


	public AllEvents getLocation() {
		return location;
	}


	public void setLocation(AllEvents location) {
		this.location = location;
	}


	public Weather getWeather() {
		return weather;
	}


	public void setWeather(Weather weather) {
		this.weather = weather;
	}


	@Override
	public String toString() {
		return "TodaysWeather [location=" + location + ", weather=" + weather + "]";
	}
}