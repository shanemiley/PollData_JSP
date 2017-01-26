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
        <title>Poll</title>
    </head>

    <body>
        <h1>Poll</h1>
        <h1>${pollData.title}</h1>
        <form method="POST" >

            <table>
                <c:forEach var="i" items="${pollData.questions}">

                    <c:out value="${i}"/><br>
                    
                    <input type="text" name="answer"/><br>

                </c:forEach>
            </table><br>
            <input type="submit" value="Done"/>
        </form>

    </body>
</html>
