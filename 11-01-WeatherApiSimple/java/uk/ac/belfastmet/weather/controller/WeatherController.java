package uk.ac.belfastmet.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WeatherController
{
	
	@Autowired
	WeatherService weatherService;

	
	private TodaysWeather todaysWeather;
	
		
	
	
	@GetMapping("/")
	@ResponseBody
	public String home(Model model)
	{
		model.addAttribute("pageTitle","Weather");
		RestTemplate restTemplate = new RestTemplate();
		
		
		this.weatherService = new WeatherService();
		this.todaysWeather = weatherService.getTodaysWeather;
		
		return this.todaysWeather.getWeather;
	}
	
	
	
	
	
}
