package Forms1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class homeController
{//class homeController open
	@GetMapping("/")
	public String home()
	{
		return "formPage";
	}
	
	@GetMapping("/results")
	public String results
		(
			@RequestParam("firstname") String firstName,
			@RequestParam("lastname") String LastName, 
			@RequestParam("gender")String gender,
			Model model
		)
			
		{	
			model.addAttribute("firstname", firstName);
			model.addAttribute("LastName", LastName);
			model.addAttribute("gender", gender);
			return "resultPage";
		}

}//class homeController close