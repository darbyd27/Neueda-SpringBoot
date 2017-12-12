package uk.ac.belfastmet.cereal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.domain.Cereal;
import uk.ac.belfastmet.cereal.respository.CerealRepository;

@Controller
@RequestMapping("/cereal")
public class CerealController
{

	@Autowired
	CerealRepository cerealRepository;

		public CerealController(CerealRepository cerealRepository)
		{
			super();
			this.cerealRepository = cerealRepository;
		}

	@GetMapping("/")
	public String allCereals(Model model)
	{
		model.addAttribute("pageTitle","All Cereals!");
		model.addAttribute("cereals", cerealRepository.findAll());
		return "cerealPage";
	}
	

	@GetMapping("/cereal/cereal/{cerealId}")
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "viewCereal";	
	}
	
	@GetMapping("/cereal/edit")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editCereal";
	}
}