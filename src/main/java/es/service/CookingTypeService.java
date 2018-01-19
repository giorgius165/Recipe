package es.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.controller.CookingTypeController;
import es.model.CookingType;
import es.repository.CookingTypeRepository;

@Component
public class CookingTypeService implements Service{
	
	private static Logger log = LogManager.getLogger(CookingTypeController.class);
	
	@Autowired
	private CookingTypeRepository repository;

	@Override
	public void insert(CookingType cookingType) {
		log.debug("hola");
		// TODO Auto-generated method stub
		repository.insert(cookingType);
		
	}

	public CookingTypeRepository getRepository() {
		return repository;
	}

	public void setRepository(CookingTypeRepository repository) {
		this.repository = repository;
	}
	
	

}
