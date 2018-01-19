package es.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import es.controller.CookingTypeController;
import es.model.CookingType;

@Repository
public class CookingTypeRepository {

	private static Logger log = LogManager.getLogger(CookingTypeController.class);
	
	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public void insert(CookingType cookingType) {
		String sql = "INSERT INTO USER (name)" + "VALUES ( :name)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", cookingType.getName());
		getNamedJdbcTemplate().update(sql, params);
	}


	public static Logger getLog() {
		return log;
	}


	public static void setLog(Logger log) {
		CookingTypeRepository.log = log;
	}


	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}


	private JdbcTemplate getNamedJdbcTemplate() {
		// TODO Auto-generated method stub
		return null;
	}


	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
