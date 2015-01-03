<%@page import="com.AFK.travel56.dao.ArticleVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="true" import="java.util.*, travel.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>대륙게시판입니다.</title>
</head>
<body>

	<p>
		<strong>대륙게시판</strong>
	</p>
	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<th>No.</th>
			<th>제목</th>
			<th>작성자</th>
			<th>추천수</th>
			<th>조회수</th>
		</tr>
		<%
			List<ArticleVO> theArticles = (List<ArticleVO>) session
					.getAttribute("continentArticle");

			System.out.print(theArticles);
			if (theArticles != null && theArticles.size() > 0) {

				for (int i = 0; i < theArticles.size(); ++i) {
					ArticleVO findAticle = theArticles.get(i);
		%>
		<tr>
			<form name="removeForm" action="<c:url value='/action/cart'/>"
				method="POST">
				<input type="hidden" name="todo" value="remove"> <input
					type="hidden" name="cartIndex"
					value="<%=findAticle.getMemberNumber()%>">
				<td><%=findAticle.getArticleNumber()%></td>
				<td><%=findAticle.getArticleTitle()%></td>
				<td><%=findAticle.getMemberNickName()%></td>
				<td align="right"><%=findAticle.getArticleRecommendCount()%></td>
				<td align="right"><%=findAticle.getArticleViewCount()%></td>
			</form>
		</tr>
		<%
			} // for loop
		%>
	</table>
	<br />
	<%
		}
	%>
</body>
</html>