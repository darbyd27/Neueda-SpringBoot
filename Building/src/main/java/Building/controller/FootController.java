package Building.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Building.service.BuildingService;
import Building.domain.Building;
import Building.service.BuildingService;


@Controller
@RequestMapping("/foot")
public class FootController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping("/")
	public String foot(Model model)
	{
		model.addAttribute("pageTitle","Foot!");
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getfootBuildings());
		return "footPage";
	}



	
	
}