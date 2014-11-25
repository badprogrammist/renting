<%--
  Created by IntelliJ IDEA.
  User: Ильдар
  Date: 24.11.2014
  Time: 21:23
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<table>
    <g:each in="${places}" var="placeInstance">
        <tr>
            <td>${placeInstance.title}</td>
            <td>${placeInstance.description}</td>
            <td>${placeInstance.capacity.title}</td>
            <td>
                <ul>
                    <g:each in="${placeInstance.tariffs}" var="tariffInstance">
                        <li>${tariffInstance.rent} / ${tariffInstance.duration.count} ${tariffInstance.duration.period.title}</li>
                    </g:each>
                </ul>

            </td>
            <td><g:link controller="place" action="view" id="${placeInstance.id}">Подробнее</g:link></td> </td>
        </tr>
    </g:each>
</table>

</body>
</html>