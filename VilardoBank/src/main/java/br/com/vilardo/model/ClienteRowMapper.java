package br.com.vilardo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteRowMapper implements RowMapper<Cliente>{
	
	/**
	 * Classe de mapeamento da tabela TB_CLIENTE
	 * @author victor.vilardo
	 */

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Cliente cliente = new Cliente ();
		
		cliente.setId(rs.getInt("id"));
		cliente.setNome(rs.getString("nome"));
		cliente.setCpf(rs.getString("cpf"));
		cliente.setSaldo(rs.getDouble("saldo"));
		cliente.setAgencia(rs.getInt("agencia"));
		cliente.setConta(rs.getInt("conta"));
		
		
		return cliente;
	}

}
