package renting.event

import renting.Duration
import renting.Period
import renting.event.EventType
import renting.place.Place
import renting.tariff.Tariff

class EventController {

    def EventService eventService;

    def index() { }

    def offer() {
        String title = params.title;
        String description = params.description;
        Period period = Period.valueOf(params.period);
        int periodCount = Integer.valueOf(params.periodCount);
        Place place = Place.get(params.placeId);
        EventType eventType = EventType.get(params.eventTypeId);
        Date eventDate = params.eventDate;

        EventInfo info = new EventInfo(title: title,description: description);
        Duration duration = new Duration(period: period,count: periodCount);

        Event event = eventService.offer(info,place,duration,eventDate,eventType);

        return [reservationInstance : event];

    }
}
