package springmvc.serch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entity.Student;


@Controller
public class FormController {

	@RequestMapping("/complex")
	public String show_form() {
		return "complex";
	}
	
	@RequestMapping(path="/handleform" , method=RequestMethod.POST)
	public String foermHandler(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "sucess";
	}
}
