<%-- 
    Document   : index
    Created on : Mar 13, 2018, 9:51:26 PM
    Author     : Emily
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ include file="connect.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie List</title>
    </head>
    <body>
        <h1>Movie List</h1>
        <sql:query dataSource = "${db}" var = "result">
            SELECT * from Movies;
        </sql:query>
            <table border="1" width="400">
                <th>ID</th>
                <th>Movie Title</th>
                
                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td><c:out value = "${row.id}"/></td>
                        <td><c:out value = "${row.movietitle}"/></td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>