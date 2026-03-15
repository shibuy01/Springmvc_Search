package springmvc.serch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userId") int userId) {
		System.out.println(userId);
		return "home";
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/home";
	}

	@RequestMapping("/home")
	public String home() {
		String str = null;
		System.out.println(str.length());
	   return "home";
	}
	

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query-box") String query) {
		
		String url = "https://www.google.com/search?q=" +query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class , NumberFormatException.class})
//	public String exceptionHandler() {
//		return"null_page";
//	}
	
}
