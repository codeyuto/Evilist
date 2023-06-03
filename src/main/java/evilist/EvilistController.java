package evilist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EvilistController {
	@GetMapping("/")
	public String index(Model model) {
		
		return "index";
		
	}
	@GetMapping("/login")
	public String login(Model model) {
		
		return "login";
	}
	
	
	@PostMapping("/auth")
	public String auth(Model model){
		System.out.print("000");
		
		
		return "redirect:/userpage";
		
	}
	
	@GetMapping("/userpage")
	public String userpage(Model model) {
		
		return "userpage";
	}
	
	@GetMapping("/textform")
	public String textform(Model model) {
		return "textform";
	}
	
	@PostMapping("/formsubmit")
	public String formsubmit(Model model) {
		
		return "result";
	}
	
	
	

}
