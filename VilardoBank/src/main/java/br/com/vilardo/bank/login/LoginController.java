package br.com.vilardo.bank.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/login")

public class LoginController {
	
	
	
	@GetMapping()
	public String iniciarLogin() {
		
		return "login";
	}
	
	
	
	
	

}
