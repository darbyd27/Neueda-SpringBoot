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
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.respository.PassengerRepository;


@Controller
@RequestMapping("/")
public class HomeController
{
	@Autowired
	PassengerRepository passengerRepository;


		
		public HomeController(PassengerRepository passengerRepository)
		{
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
		
	@GetMapping("/passenger/view/{passengerId}")
	public String view(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("pageTitle","View");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "viewPage";
	}
	
	@GetMapping("/passenger/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("pageTitle","Edit Paasenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "editPage";
	}
	
	@GetMapping("/pasenger/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer pasengerId)
	{
		passengerRepository.delete(passengerId);
		return "redirect:/";
	}
	
	
	@PostMapping("/passengers/search")
	public String search(@RequestParam("searchField") String searchField, 
	
	@RequestParam("searchString") String searchString, Model model) 
	{
		if(searchField.equals("name"))
		{		
			model.addAttribute("pageTitle","Search Passengers");
			model.addAttribute("passengers", passengerRepository.findByName("%" + searchString + "%"));
			
		}
			else if(searchField.equals("embarked"))
			{
				model.addAttribute("pageTitle","Search Passengers");
				model.addAttribute("passengers", passengerRepository.findByEmbarked(searchString));
			}
				else if (searchField.equals("passsengerClass"))
				{
					Integer pClass = Integer.parseInt(searchString);
					model.addAttribute("pageTitle","Search Passengers");
					model.addAttribute("passengers", passengerRepository.findByPclass(pClass));
				}
			
			return "passengerPage";
	}
		
		




	
}