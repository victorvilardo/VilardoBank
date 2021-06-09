package br.com.vilardo.bank.cliente.dao;

import br.com.vilardo.bank.cliente.model.Cliente;

public interface ClienteDao {

	
	Cliente buscarPorId (Integer id);

	Cliente buscarClienteUsuario(String usuario);
}
