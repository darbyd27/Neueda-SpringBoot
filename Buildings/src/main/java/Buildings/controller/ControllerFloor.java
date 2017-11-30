package Buildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/demo")

public class ControllerFloor {

@GetMapping("/")
public String floor(Model model)
{
	return "floorPage";
}



public class Building {

	private String name;
	private String cat;
	private String image;
	
	

	public Building(String name, String cat, String image) {
		super();
		this.name = name;
		this.cat = cat;
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCat() {
		return cat;
	}
	public void setcat(String cat) {
		this.cat = cat;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}






}