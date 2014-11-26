
<table>
    <tr>
        <th>Дата проведения</th>
        <th>Название</th>
        <th>Описание</th>
        <th>Тип события</th>
        <th>Продолжительность</th>
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
        </tr>
    </g:each>
</table>
