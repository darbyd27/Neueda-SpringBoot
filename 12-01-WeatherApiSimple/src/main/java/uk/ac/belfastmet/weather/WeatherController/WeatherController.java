package uk.ac.belfastmet.weather.WeatherController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;
import uk.ac.belfastmet.weather.domain.Weather;

@Controller
@RequestMapping("/")
public class WeatherController
{	
	@Value("${api.baseWeatherUrl}")
	private String baseWeatherUrl;
	
	public WeatherController()
	{
		super();
	}

	@GetMapping("")
	public String home(Model model)
	{	
		model.addAttribute("pageTitle", "Home");	
		return "homePage";
	}

	@GetMapping("/belfast")
	public String belfast(Model model)
	{	
		model.addAttribute("pageTitle", "Belfast");
		String belfastWeatherUrl= this.baseWeatherUrl + "belfast";
		System.out.println(belfastWeatherUrl);
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();	
		model.addAttribute("weather", weather);
		return "weatherPage";
	}
	
	@GetMapping("/london")
	public String london(Model model)
	{
		model.addAttribute("pageTitle", "London");
		String londonWeatherUrl= this.baseWeatherUrl + "london";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(londonWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		model.addAttribute("weather", weather);
		return "weatherPage";	
	}
	
	@GetMapping("/dublin")
	public String dublin(Model model)
	{	
		model.addAttribute("pageTitle", "Dublin");	
		String dublinWeatherUrl= this.baseWeatherUrl + "dublin";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(dublinWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		model.addAttribute("weather", weather);
		return "weatherPage";
	}
}//End
