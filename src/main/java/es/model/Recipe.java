package es.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
		tools = new ArrayList<CookingTool>();
	}
	
	private String name;
	
	private List<Ingredient> ingredients;
	//= new ArrayList<Ingredient>();
	
	private List<CookingTool> tools;
	//= new ArrayList<CookingTool>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<CookingTool> getTools() {
		return tools;
	}

	public void setTools(List<CookingTool> tools) {
		this.tools = tools;
	}

	
	
	

}
