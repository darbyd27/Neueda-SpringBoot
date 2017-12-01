package uk.ac.belfastmet.dwarf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.dwarf.respository.DwarfRepository;



@Controller
@RequestMapping("/tolkien")
public class TolkienController {


@Autowired
DwarfRepository dwarfRepository;

	public TolkienController(DwarfRepository dwarfRepository) {
	super();
	this.dwarfRepository = dwarfRepository;
}


	@GetMapping("/")
	public String tolkien(Model model)
	{
		model.addAttribute("pageTitle","Tolkien!");
		//this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Tolkien"));
		return "tolkienPage";
	}


	
}