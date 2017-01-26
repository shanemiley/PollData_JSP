<%-- 
    Document   : poll
    Created on : 20-Jan-2017, 14:08:10
    Author     : Shane
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Poll Results</title>
    </head>

    <body>
        <h1>Poll Results</h1>

        <table>
            <c:forEach var="i" begin="0" end="2">
                <c:out value="${pollData.questions.get(i)}"/>
                <c:out value="${pollData.answers.get(i)}"/><br>
            </c:forEach>
        </table><br>

    </body>
</html>
