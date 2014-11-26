<%--
  Created by IntelliJ IDEA.
  User: Ильдар
  Date: 24.11.2014
  Time: 21:23
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Все события</title>
</head>

<body>
<table>
    <tr>
        <th>Дата проведения</th>
        <th>Название</th>
        <th>Описание</th>
        <th>Тип события</th>
        <th>Продолжительность</th>
        <th>Место проведения</th>
    </tr>
    <g:each in="${events}" var="eventInstance" >
        <tr>
            <td>
                ${eventInstance.eventDate}
            </td>
            <td>
                ${eventInstance.info.title}
            </td>
            <td>
                ${eventInstance.info.description}
            </td>
            <td>
                ${eventInstance.eventType.title}
            </td>
            <td>
                ${eventInstance.duration.count} ${eventInstance.duration.period.title}
            </td>
            <td>
                <g:link controller="place" action="view" id="${eventInstance.place.id}">${eventInstance.place.title}</g:link>
            </td>
        </tr>
    </g:each>
</table>
</body>
</html>