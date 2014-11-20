<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript">
        var rootContext = "${pageContext.request.contextPath}";
    </script>
    <c:set var="context" value="${pageContext.request.contextPath}" />
    <script type="text/javascript" src="${context}/resources/js/jquery/jquery-1.11.0.js" ></script>
    <script type="text/javascript" src="${context}/resources/js/bootstrap.js" ></script>
    <script type="text/javascript" src="${context}/resources/js/bootstrap-datepicker.js" ></script>

    <link rel="stylesheet" href="${context}/resources/css/bootstrap/bootstrap.css" type="text/css" />
    <link rel="stylesheet" href="${context}/resources/css/sport_challenge/global.css" type="text/css" />
    <link rel="stylesheet" href="${context}/resources/css/bootstrap/bootstrap-theme.css" type="text/css" />
    <link rel="stylesheet" href="${context}/resources/css/bootstrap/datepicker3.css" type="text/css" />