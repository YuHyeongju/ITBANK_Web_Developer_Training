<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "header.jsp" %>    
<jsp:useBean id="dto" class="member.MemberDTO"/>
<jsp:setProperty property="*" name="dto"/> 


<c:set var="dao" value="${dao.update(userid,userpw) }"/> 
<c:if test="${row != 0 }">
	<c:redirect url="list.jsp"/>
</c:if>

</body>
</html>