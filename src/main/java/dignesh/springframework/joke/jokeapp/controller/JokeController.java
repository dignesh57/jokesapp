package dignesh.springframework.joke.jokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dignesh.springframework.joke.jokeapp.service.JokeService;
import dignesh.springframework.joke.jokeapp.service.JokeServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Controller
public class JokeController {
	
	@Autowired
	private JokeService jokeService;
	
	@Autowired
	private ChuckNorrisQuotes chuckNorrisQuotes;
	
//	@Autowired
//	public JokeController() {
//		this.jokeService=new JokeServiceImpl(chuckNorrisQuotes);
//	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke",jokeService.getJoke());
		return "chucknorris";
	}
}
