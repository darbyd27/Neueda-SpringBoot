package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/demo")

public class ControllerDemo {

@GetMapping("/")
public String disney(Model model)
{
	return "disneyPage";
}


@GetMapping("/bingo")
public String bingo(Model model)
{
	return "Dog";
}


@GetMapping("/Namo")
public String Namo(Model model)
{
	return "Pupper";
}

}