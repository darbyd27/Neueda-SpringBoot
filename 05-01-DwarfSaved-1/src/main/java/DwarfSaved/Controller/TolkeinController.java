package DwarfSaved.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/tolkien")
public class TolkeinController {



	@GetMapping("/")
	public String tolkien(Model model)
	{
		model.addAttribute("pageTitle","Tolkien!");
		//this.dwarfService = new DwarfService();
		//model.addAttribute("dwarfs", this.dwarfService.getTolkienDwarfs());
		return "tolkienPage";
	}

	
}

