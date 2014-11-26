package renting.event

import renting.Duration
import renting.Period
import renting.place.Place
import org.springframework.security.access.annotation.Secured

class EventController {

    def EventService eventService;

    @Secured(['permitAll'])
    def index() { }

    @Secured(['permitAll'])
    def list() {
        return [events:Event.all];
    }

    @Secured(['ROLE_USER'])
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

        render(template: "events",model: [events:eventService.getPlaceEvents(place)] );
    }

    @Secured(['ROLE_USER'])
    def addEvent() {
        render(template: "addEvent",model: [placeInstance:Place.get(params.id)]);
    }
}
