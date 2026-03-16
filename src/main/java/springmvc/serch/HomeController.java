package springmvc.serch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	
	@RequestMapping("/form")
	public String form() {
		return"form";
	}
	
	@PostMapping("/welcome")
	public String welcome(@RequestParam("field") String name , Model m) {
		System.out.println(name);
		m.addAttribute("name", name);
		return"welcome";
	}
}
