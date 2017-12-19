package uk.ac.belfastmet.event.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.event.domain.Data;
import uk.ac.belfastmet.event.domain.Weather;

@Controller
@RequestMapping("/")
public class EventController {
	
	@Value("${api.baseWeatherUrl}")
	private String baseWeatherUrl;
	

	public EventController() {
		super();

	}

	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("pageTitle", "Home");
	
		
		return "homePage";
	}

	@GetMapping("/event")
	public String event(Model model) {
		
		model.addAttribute("pageTitle", "Event");
		
		String eventUrl= this.eventUrl + "belfast";
		System.out.println(eventWeatherUrl);
		RestTemplate restTemplate = new RestTemplate();
		Data todaysWeather = restTemplate.getForObject(eventUrl, Data.class);
		Event event = todaysWeather.getevent();
		
		model.addAttribute("event", event);
		
		
		return "eventPage";
	}
	

		

	
	
	
}
