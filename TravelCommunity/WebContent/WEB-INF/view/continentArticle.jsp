<%@page import="com.AFK.travel56.dao.ArticleVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="true" import="java.util.*, com.AFK.travel56.dao.*"%>
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
			if (theArticles != null && theArticles.size() > 0) {

				for (int i = 0; i < theArticles.size(); ++i) {
					ArticleVO findArticle = theArticles.get(i);
		%>
		<tr>
			<form name="removeForm" action="<c:url value='/action/cart'/>"
				method="POST">
				<input type="hidden" name="todo" value="remove"> <input
					type="hidden" name="cartIndex"
					value="<%=findArticle.getMemberNumber()%>">
				<td>"<%=findArticle.getArticleNumber()%></td>
				<td>
					<form name="testform" action="<c:url value='/action/readArticle'/>"
						method="POST">
						<input type="checkbox" name="test"
							value="<%=findArticle.getArticleNumber()%>"><%=findArticle.getArticleTitle()%><input
							type="submit" value="Checkout">
					</form>
				</td>






				<td><%=findArticle.getMemberNickName()%></td>
				<td align="right"><%=findArticle.getArticleRecommendCount()%></td>
				<td align="right"><%=findArticle.getArticleViewCount()%></td>

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