package br.com.vilardo.bank.cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/cliente")
public class ClienteController {

	
	@GetMapping(path="/{id}")

	public ModelAndView inicio (@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView("home");
		
	
		return mv;
	
	}
}
