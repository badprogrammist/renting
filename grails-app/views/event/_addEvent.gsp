<g:form>
    <p><g:textField name="title"/></p>
    <p><g:textArea name="description"/></p>
    <p><g:datePicker name="eventDate" type="date"/></p>
    <p>
        <g:textField name="periodCount" value="1"/>
        <g:select name="period" from="${renting.Period.values()}" optionValue="title"/>
    </p>
    <p><g:select name="eventTypeId" from="${renting.event.EventType.list()}" optionValue="title" optionKey="id"/></p>
    <g:hiddenField name="placeId" value="${placeInstance.id}"/>
    <g:submitToRemote url="[controller:'event',action:'offer']" value="Зарезервировать" update="place_event_container"/>
</g:form>
