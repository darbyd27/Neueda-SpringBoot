package uk.ac.belfastmet.Forms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String home(Model model)
	{
		return "Form";
	}
	
	

}