<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=1">
<link href="/academy/resources/partners/sist/css/style.css" type="text/css" rel="stylesheet">
<title>아카데미 인덱스</title>
</head> 
<body class="height-expand">
	<main class="height-expand">
		<section class="jagged-slider height-expand">
			<!-- <h1>${academy.name}</h1>
			<ul>
				<c:forEach var="menu" items="${academy.mainMenus}">
					<li>${menu.title}</li>
				</c:forEach>
			</ul> -->
			<h1 class="hidden">화면 슬라이더(JaggedSlider)</h1>
			<div class="slider-axis height-expand">
				<div class="slider-wing">
					<div class="wing-item">1-1</div>
					<div class="wing-item">1-2</div>
					<div class="wing-item">1-3</div>
					<div class="wing-item">1-4</div>
				</div>
				<div class="slider-wing">
					<div class="wing-item">2-1</div>
					<div class="wing-item">2-2</div>
					<div class="wing-item">2-3</div>
					<div class="wing-item">2-4</div>
				</div>
				<div class="slider-wing">
					<div class="wing-item">3-1</div>
					<div class="wing-item">3-2</div>
					<div class="wing-item">3-3</div>
					<div class="wing-item">3-4</div>
				</div>
			</div>
		</section>
	</main>
</body>
</html>
