package fr.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeteoController {

	@GetMapping("/meteo")
	public String meteo(Model model) {
		return "meteo";
	}
}
