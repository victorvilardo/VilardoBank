package br.com.vilardo.bank.login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vilardo.bank.cliente.dao.ClienteDao;
import br.com.vilardo.bank.cliente.model.Cliente;



@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private ClienteDao dao;
	
	@Override
	public Cliente buscarClienteUsuario(String usuario) {
		return dao.buscarClienteUsuario(usuario);
	}

}
