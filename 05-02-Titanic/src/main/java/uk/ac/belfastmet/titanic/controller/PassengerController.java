package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.respository.PassengerRepository;

@Controller
@RequestMapping("/passenger")
public class PassengerController
{

	@Autowired
	PassengerRepository passengerRepository;

		public PassengerController(PassengerRepository passengerRepository)
		{
			super();
			this.passengerRepository = passengerRepository;
		}

	@GetMapping("/")
	public String allPassengers(Model model)
	{
		model.addAttribute("pageTitle","All Passengers!");

		model.addAttribute("passengers", passengerRepository.findAll());
		return "passengersPage";
	}
	
	

}