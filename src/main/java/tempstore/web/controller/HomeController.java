package tempstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tempstore.repositories.interfaces.ReadingRepository;

@Controller
@RequestMapping("/")
public class HomeController {

	private ReadingRepository readingRepo;

	@Autowired
	public HomeController(ReadingRepository readingRepo) {
		this.readingRepo = readingRepo;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute(readingRepo.findReadings());
		return "home";
	}
}
