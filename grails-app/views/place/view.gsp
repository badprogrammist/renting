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
<g:link controller="place" action="list">Вернуться к списку</g:link>
<p>${placeInstance.title}</p>
<p>${placeInstance.description}</p>
<p>${placeInstance.capacity.title}</p>
<ul>
    <g:each in="${placeInstance.eventTypes}" var="placeEventTypeInstance">
        <li>${placeEventTypeInstance.eventType.title}</li>
    </g:each>
</ul>
<ul>
    <g:each in="${placeInstance.tariffs}" var="tariffInstance">
        <li>${tariffInstance.rent} / ${tariffInstance.duration.count} ${tariffInstance.duration.period.title}</li>
    </g:each>
</ul>

<g:form controller="event" action="offer">
    <p><g:textField name="title"/></p>

    <p><g:textArea name="description"/></p>
    <p><g:datePicker name="eventDate" type="date"/></p>
    <p>
        <g:textField name="periodCount"/>
        <g:select name="period" from="${renting.Period.values()}" optionValue="title"/>
    </p>
    <p><g:select name="eventTypeId" from="${renting.event.EventType.list()}" optionValue="title" optionKey="id"/></p>
    <g:hiddenField name="placeId" value="${placeInstance.id}"/>
    <g:submitButton name="Зарезервировать"/>
</g:form>

</body>
</html>