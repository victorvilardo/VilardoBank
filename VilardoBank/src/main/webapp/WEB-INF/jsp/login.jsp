<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
 <%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"%>  
  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
		<!-- JavaScript Bundle with Popper -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
		
	 </head> 
	 
	 
	<body>
	
		<div class ="container" style="width: 35%" >
		<h1 class="text-center" style="padding-top: 50px ">Vilardo Bank</h1>
		
		<c:if test='${not empty mensagem}'>
			<div class="alert alert-danger" role="alert">
			  <c:out value="${mensagem}" />
			</div>
		</c:if>
		
		teste
		
		
		<form action="/login">
			  <div class="mb-3">
			    <label for="txtUsuario" class="form-label">Usuário</label>
			    <input type="txt" name= "usuario" class="form-control" id="txtUsuario" >
			  </div>
			  <div class="mb-3">
			    <label for="txtSenha" class="form-label">Senha</label>
			    <input type="password" class="form-control" id="txtSenha">
			  </div>
			  <button type="submit" class="btn btn-primary">Autenticar</button>
			  
		</form>
		</div>
	</body>
</html>