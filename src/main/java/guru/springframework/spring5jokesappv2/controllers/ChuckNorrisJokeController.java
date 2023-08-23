package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {


	private final JokeService jokeService;

	public ChuckNorrisJokeController(JokeService jokeService)
	{
		this.jokeService = jokeService;
	}

	@RequestMapping("/")
	public String getChuckNorrisJoke(Model model)
	{
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
}
