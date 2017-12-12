package uk.ac.belfastmet.cereal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.respository.cerealRepository;


@Controller
@RequestMapping("/cereal")
public class cerealController {

	@Autowired
	cerealRepository cerealRepository;
	
	public cerealController(cerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}



	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle","Cereal");
		model.addAttribute("cereals", cerealRepository.findAll());
		return "cerealPage";
	}
	
}
