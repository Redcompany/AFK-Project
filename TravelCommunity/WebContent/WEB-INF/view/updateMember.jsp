<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="true" import="java.util.*, travel.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<title>회원정보변경</title>
<meta charset="UTF-8">
</head>
<style>
td {
	background-color: white;
	font-size: 30px;
	font-weight: 900;
	font-family: fantasy;
}

input {
	border-radius: 4px 4px 4px 4px;
	width: 250px;
	height: 30px;
}
</style>

<body>
	<form name="UpdateMemberOKForm"
		action="<c:url value='/action/home'/>" method="POST">
		<table id='membershipChange' width="700" height="700" align="center">
			<tr>
				<td class="membership" colspan="2" align="center">회원정보변경</td>
			</tr>
			<tr>
				<td width="300" align="center">현재 비밀번호</td>
				<td><input type="text" name="presentPass"></td>
			</tr>
			<tr>
				<td align="center">비밀번호</td>
				<td><input type="text" name="rePass"></td>
			</tr>
			<tr>
				<td align="center">재확인</td>
				<td><input type="text" name="reconfirm"></td>
			</tr>
			<tr>
				<td align="center">이름</td>
				<td><input type="text" name="rename"></td>
			</tr>
			<tr>
				<td align="center">휴대전화</td>
				<td><input type="text" name="changePhonenumber"></td>
			</tr>
			<tr>
				<td align="center">eMail</td>
				<td><input type="text" name="changeMail"></td>
			</tr>
			<tr height="80">
				<td colspan="3" align="center">
				<input type="submit" name="todo" value="확 인">
				</form>
					<form name="checkoutForm" action="<c:url value='/action/home'/>"
						method="POST">
						<input class="cancel" type="submit" value="취 소">
					</form>
					<form name="checkoutForm" action="<c:url value='/action/home'/>"
						method="POST">
						<input class="delete" type="submit" value="탈 퇴">
					</form>
				</td>
			</tr>

		</table>
</body>
</html>