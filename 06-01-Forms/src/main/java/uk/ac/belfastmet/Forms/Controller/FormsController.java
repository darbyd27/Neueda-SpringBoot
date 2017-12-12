package uk.ac.belfastmet.Forms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Result")
public class FormsController
{
@GetMapping("/Result")
public String Result(Model model)
{
	return "Result";
}

}