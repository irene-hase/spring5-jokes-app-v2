package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {


	private final ChuckNorrisService chuckNorrisService;

	public ChuckNorrisJokeController(ChuckNorrisService chuckNorrisService)
	{
		this.chuckNorrisService = chuckNorrisService;
	}

	@RequestMapping("/")
	public String getChuckNorrisJoke(Model model)
	{
		model.addAttribute("joke", chuckNorrisService.getChuckNorrisQuote());
		return "index";
	}
}
