package br.com.vilardo.bank.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.vilardo.bank.cliente.model.Cliente;
import br.com.vilardo.bank.login.service.LoginService;



@Controller
@RequestMapping ("/login")

public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping()
	public String iniciarLogin() {
		
	
		return "login";
	}
	
	public ModelAndView home() {
		
		
		return new ModelAndView("/home");
	}
	
	
	
	
	@PostMapping()
	public String autenticar(Login login, RedirectAttributes atributos) {
		
		Cliente cliente = service.buscarClienteUsuario(login.getUsuario());
		
		if (cliente==null) {
			
			atributos.addFlashAttribute("mensagem", "Usuário ou senha inválidos!");
			
			return "redirect:/login";
		}
		
		return "login";
		
	}
	
	
	

}
