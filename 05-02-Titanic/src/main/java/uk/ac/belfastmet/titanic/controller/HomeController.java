package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.respository.PassengerRepository;


@Controller
@RequestMapping("/")
public class HomeController
{
	@Autowired
	PassengerRepository passengerRepository;


		
		public HomeController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}



	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle","Home");
		model.addAttribute("passengers", passengerRepository.findAll());
		return "homePage";
	}
		
}

