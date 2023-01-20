<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<link rel="stylesheet" type ="text/css"  href="<%=request.getContextPath()%>\resources\css\style.css"> 


	<title>Insert title here</title>
</head>
<body>
	<f:form action="saveEtudiant" modelAttribute="etudiant">
	<h1>Gestion des Etudiants </h1>
		<table>
			<tr>
			<td>ID Etudiant:<f:hidden path="idEtudiant"/></td>
			<td>${etudiant.idEtudiant}</td>
			</tr>
			<tr>
			<td>Nom et Prenom Etudiant:</td>
			<td><f:input path="nomPrenomEtudiant"/></td>
			<td><f:errors path="nomPrenomEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>Classe:</td>
			<td><f:input path="classe"/></td>
			<td><f:errors path="classe" cssClass="error"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="Save"  id="button"></td>
			</tr>
		</table>
	</f:form>
	
	<table border="1" width="80%">
		<tr>
		<th>ID</th><th>Nom et Prenom </th><th>Classe</th><th>Suppression</th><th>Edition</th>
		</tr>
	<c:forEach items="${etudiants}" var="e">
		<tr>
		<td>${e.idEtudiant }</td>
		<td>${e.nomPrenomEtudiant }</td>
		<td>${e.classe}</td>
		<td><a href="deleteEtudiant?id=${e.idEtudiant }">Supprimer</a></td>
		<td><a href="editEtudiant/${e.idEtudiant}">Edit</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
