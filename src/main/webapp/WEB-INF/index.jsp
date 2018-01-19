<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" 
prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="recipeInsert" method="post">
		<span>Nombre de la Receta:</span> 
		<form:input  type="text" path="recipe."/><br/>
		<input type="submit" value="Guardar nombre receta"/>
	</form:form>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<form:form action="ingredientInsert" method="post">
		<span>Nuevo Ingrediente:</span> 
		<form:input  type="text" path="recipe."/><br/>
		<input type="submit" value="Guardar ingrediente"/>
	</form:form>
	<table border="1">
		<thead>
			<tr>
				<td>Nombre del ingrediente</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ingredient" items="${ingredients}">
				<tr>
					<td><c:out value="${ingredient.nombre}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<form:form action="cookingToolInsert" method="post">
		<span>Nuevo Utensilio:</span> 
		<form:input  type="text" path="recipe."/><br/>
		<input type="submit" value="Guardar tool"/>
	</form:form>
	<table border="1">
		<thead>
			<tr>
				<td>Nombre del utensilio</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tool" items="${tools}">
				<tr>
					<td><c:out value="${tool.nombre}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>