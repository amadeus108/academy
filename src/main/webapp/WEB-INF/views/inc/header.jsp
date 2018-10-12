<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<header id="header" class="flex flex-row">
	<h1><a href=""><img src="/academy/resources/partners/sist/images/logo.png" alt="쌍용교육센터" /></a></h1>
	<section>
		<h1 class="hidden">사용자 프로필</h1>
		<div>사진</div>
		<div>
			<!-- 로그인 여부에 따라 메뉴 숨기고 나타내기 -->
			<security:authorize access="!isAuthenticated()"> 
				<a href="/academy/member/login">로그인</a>
			</security:authorize>
			<security:authorize access="isAuthenticated()">
				<a href="/member/logout"> 
				<security:authentication property="name" /> 님 로그아웃
				</a>
			</security:authorize>
			<a href="/member/join">회원가입</a>
			<!-- teacher 권한이 있어야 태그가 보이도록 설정 -->
			<security:authorize access="hasRole('TEACHER')"> 
				<div class="notice">
					<span>강사공지 : </span><a href="#">3</a>
				</div>
			</security:authorize>
		</div>
	</section>
	<section class="bg-white main-menu flex-item-push">
		<h1 class="hidden">헤더 메뉴</h1>
		<ul class="hidden main-menu-list show-md-block">
			<c:forEach var="menu" items="${mainMenus}">
				<li><a href="${menu.id}">${menu.title}</a></li>
			</c:forEach>
<!-- 			<li><a href="">센터소개</a></li> -->
<!-- 			<li><a href="">재직자교육과정</a> -->
<!-- 			<li><a href="">취업교육과정</a></li> -->
<!-- 			<li><a href="">예약센터</a></li> -->
<!-- 			<li><a href="">교육서비스</a></li> -->
<!-- 			<li><a href="">인재추천의뢰</a></li> -->
<!-- 			<li><a href="">고객센터</a></li> -->
		</ul>
		<div>
			<h2 class="hidden">메뉴 버튼들</h2>
			<span class="hidden">검색버튼</span>
			<span class="btn btn-hamburger btnㅡmd-hamburger">확장버튼</span> 
			<!-- div는 박스, 블럭단위, span은 inline 단위 -->
		</div>
	</section>
	<section class="hidden bg-gray">
		<h1>홍보</h1>
		<div class="content">로고 최우수 훈련기관 5년 인증 선정 : 최상위 1%만 선정 - 고용노동부</div>
	</section>
</header>