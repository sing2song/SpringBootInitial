<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.-1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>테스트용 화면</title>
</head>
<body>
    <c:forEach items="${list}" var="user">
        ${user.num}<br/>
        ${user.userId}<br/>
        ${user.userPwd}<br/>
    </c:forEach>
</body>
</html>