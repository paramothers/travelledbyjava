package param.others.learningspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import param.others.learningspringboot.domain.Chapter;
import param.others.learningspringboot.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@RestController
public class HomeController {
	
	private ChapterRepository chapterRepository;	
	
	
	public HomeController(ChapterRepository chapterRepository) {
		this.chapterRepository = chapterRepository;
	}

	@GetMapping("chapters")
	public Flux<Chapter> listing(){
		
		return chapterRepository.findAll();
	}


	@GetMapping("/greeting")
	public String greeting(@RequestParam(defaultValue="", required=false) String name) {
		
		return name.equals("") ? " Welcome ": "Welcome, "+name;
	}

}
