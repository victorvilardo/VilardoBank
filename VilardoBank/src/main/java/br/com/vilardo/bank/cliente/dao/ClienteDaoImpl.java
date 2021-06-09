package br.com.vilardo.bank.cliente.dao;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.vilardo.bank.cliente.model.Cliente;
import br.com.vilardo.bank.cliente.model.ClienteRowMapper;



@Repository
public class ClienteDaoImpl implements ClienteDao {

private static final Logger LOGGER = LoggerFactory.getLogger(ClienteDaoImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	
	@Autowired
	private DataSource ds;
	
	@Override
	public Cliente buscarPorId(Integer id) {
		return null;
	}

	
	
	/**
	 * Método que faz a busca de um usuario
	 * @param = usuario 
	 */
	
	
	@Override
	public Cliente buscarClienteUsuario(String usuario) {

		try {
			StringBuilder sql = new StringBuilder(" SELECT * FROM TB_CLIENTE WHERE usuario = :usuario ");

			// classe para mapear as variaveis da query e seta um valor nele
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue("usuario", usuario);
			
			// metodo que executa a query
			Cliente cliente = template.queryForObject(sql.toString(), params, new ClienteRowMapper());
			
			return cliente;
		} catch (EmptyResultDataAccessException e) {
			LOGGER.info("Não foi encontado cliente com o usuario: " + usuario);
			return null;
		}
		
	}

}
