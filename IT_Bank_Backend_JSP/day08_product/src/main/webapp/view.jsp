<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section class="frame">
	<c:set var="dto" value="${dao.selectOne(param.idx) }"></c:set>
	<div class="detail">
		<div>${dto.name }</div>
		<div>${dto.price }</div>
	</div>
	<div class="sb">
		<div>
			<a href="${cpath }/list.jsp"><button>목록</button></a>
		</div>
		
		<div>
			<a href="${cpath }/modify.jsp?idx=${dto.idx }"><button>수정</button></a>
			<a href="${cpath }/delete.jsp?idx=${dto.idx }"><button>삭제</button></a>
		</div>
	
	</div>
	
	
</section>



</body>
</html>