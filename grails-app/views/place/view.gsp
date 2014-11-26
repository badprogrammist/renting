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
    <title>${placeInstance.title}</title>
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

<button onclick="<g:remoteFunction controller='event' action='addEvent' id='${placeInstance.id}' update='place_event_container'/>">Предложить событие</button>
<div id="place_event_container">
    <g:render template="/event/events" model="${[events:events]}"/>
</div>


</body>
</html>