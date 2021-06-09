package br.com.vilardo.bank.login.service;

import br.com.vilardo.bank.cliente.model.Cliente;

public interface LoginService {

	Cliente buscarClienteUsuario(String usuario);
	
	
}
