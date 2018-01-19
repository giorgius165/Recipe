package es.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.model.CookingType;
import es.service.Service;

@Controller
public class CookingTypeController {

	private static Logger log = LogManager.getLogger(CookingTypeController.class);
	
	@Autowired
	private Service service;

	@GetMapping("/CookingType")
	public ModelAndView user() {
		log.debug("Entrando a insertar un nuevo tipo de comida");
		return new ModelAndView("cookingType", "command", new CookingType());
	}
	
	@PostMapping
	@RequestMapping("/cookingTypeInsert")
	public ModelAndView create(@ModelAttribute("cookingType") CookingType cookingType) {
		log.debug("Inserting cookingType");
		service.insert(cookingType);
		return new ModelAndView("cookingType", "command", new CookingType());
	}
	

}