package uk.ac.belfastmet.event.service;



import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.event.domain.Data;

import org.springframework.stereotype.Service;

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


public Data getTodayWeather()
{
	String todaysWeather = this.belfastWeatherUrl;
	Data todaysWeather = restTemplate.getForObject(todaysWeather, Data.class);
	
	return todaysWeather;
}


}



