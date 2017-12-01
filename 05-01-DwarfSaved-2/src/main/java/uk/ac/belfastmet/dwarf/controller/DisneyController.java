package uk.ac.belfastmet.dwarf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.dwarf.respository.DwarfRepository;



@Controller
@RequestMapping("/disney")
public class DisneyController {


@Autowired
DwarfRepository dwarfRepository;

	public DisneyController(DwarfRepository dwarfRepository) {
	super();
	this.dwarfRepository = dwarfRepository;
}


	@GetMapping("/")
	public String disney(Model model)
	{
		model.addAttribute("pageTitle","Disney!");
		//this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Disney"));
		return "disneyPage";
	}


	
}
