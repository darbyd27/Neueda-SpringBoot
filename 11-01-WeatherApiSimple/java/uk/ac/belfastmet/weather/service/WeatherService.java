package uk.ac.belfastmet.weather.service;



import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.weather.domain.TodaysWeather;

@Service
public class WeatherService
{


private String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?Location=Belfast";
private String DublinWeatheUrl = "http://www.codingfury.net/training/weathersample/weather.php?Location=Dublin";
private String LondonWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?Location=London";

private RestTemplate restTemplate;



public WeatherService(RestTemplate restTemplate)
{
	super();
	this.restTemplate=restTemplate;
}


public TodaysWeather getTodayWeather()
{
	String todaysWeather = this.belfastWeatherUrl;
	TodaysWeather todaysWeather = restTemplate.getForObject(todaysWeather, TodaysWeather.class);
	
	return todaysWeather;
}


}



