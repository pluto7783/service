<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>

<div id="navbar">
	<div id="logo">홈</div>
	<ul>
		<li data-url="/main/tetris.do">테트리스</li>
		<li>메뉴2</li>
		<li>메뉴3</li>
	</ul>
</div>	

<script type="text/javascript">
$("#logo").on("click",function(){
	location.href = "/main/index.do";
});

$("#navbar li").on("click",function(){
	if($(this).data("url") != ""){
		location.href = $(this).data("url");
	}
});
</script>