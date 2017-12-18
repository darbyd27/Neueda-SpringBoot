package uk.ac.belfastmet.weather.domain;
 
public class Weather
{
	

	
	private String description;
	private String precipatation;
	private Float temperature;
	private String humidity;
	private Integer pressure;
	private Integer cloudcover;
	private Wind wind;
	private String image;
	
	
	public Weather() {
		super();
		
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrecipatation() {
		return precipatation;
	}
	public void setPrecipatation(String precipatation) {
		this.precipatation = precipatation;
	}
	public Float getTemperature() {
		return temperature;
	}
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	public Integer getCloudcover() {
		return cloudcover;
	}
	public void setCloudcover(Integer cloudcover) {
		this.cloudcover = cloudcover;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
	
}


