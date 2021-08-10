<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>Medilab</title>
<link rel="stylesheet" href="stylesweb.css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>
<body>
	<header class="header-icon">
		<img src="assets/images/logo-medilab.png" alt="Medilab" width="150"
			height="70" />
	</header>
	<nav class="navbar">
		<a href="#"> <img src="assets/images/icon-anterior.png" />
		</a> <a href="#"> <img src="assets/images/icon-proximo.png" />
		</a>
		<form>
			<input class="navbar-search" type="text" name="search"
				placeholder="Search.." />
		</form>
	</nav>
	<div class="container">
		<div class="aside">
			<div class="aside-icon">
				<img src="assets/images/logo-anamnese.png" />
			</div>
			<div class="aside-text">
				Bem vindo(a), <a href="#">medilab</a>
			</div>
			<div>
				<a href="Controller" class="button">Sair</a>
			</div>
		</div>
		<div class="content">
			<div class="content-title">
				<h2>Título</h2>
			</div>
			<table id="content-table">
				<tr>
					<th>ID Paciente</th>
					<th>Paciente</th>
					<th>Numero</th>
					<th>Tipo de exame</th>
					<th>Modalidade</th>
					<th>Data</th>
					<th>Visualização</th>
				</tr>
				<tr>
					<td>fasfasdf</td>
					<td>sfasfasfas</td>
					<td>sfasfasfas</td>
					<td>sfasfasfas</td>
					<td>sfasfasfas</td>
					<td>sfasfasfas</td>
					<td>sfasfasfas</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>