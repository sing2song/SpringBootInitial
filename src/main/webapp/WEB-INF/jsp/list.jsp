<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.-1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>테스트용 화면</title>
</head>
<body>
테스트<hr/>
<c:if test="${userList}">
    list is null<br/><br/>
</c:if>
<c:if test="${!userList}">
    list is not null<br/><br/>
</c:if>

    <c:forEach items="${userList}" var="user">
        num: ${user.num}<br/>
        id: ${user.userId}<br/>
        pwd: ${user.userPwd}<br/>
    </c:forEach>
</body>
</html>