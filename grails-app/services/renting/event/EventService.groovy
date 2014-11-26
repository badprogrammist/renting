package renting.event

import grails.transaction.Transactional
import renting.Duration
import renting.event.EventType
import renting.place.Place
import renting.place.PlaceService
import renting.tariff.Tariff

@Transactional
class EventService {

    def PlaceService placeService;

    def Event offer(EventInfo info,Place place,Duration duration,Date eventDate,EventType eventType) throws EventServiceException {
        if(info?.title && info?.description && place && duration?.count && duration?.period && eventDate && eventType) {
            if(placeService.isVacant(place,duration,eventDate)) {
                BigDecimal rent = placeService.calculatePrice(duration,place);
                def event = new Event(
                        info: info,
                        place: place,
                        rent: rent,
                        duration: duration,
                        eventDate: eventDate,
                        eventType: eventType
                );
                return event.save(flush: true);
            } else {
                throw new EventServiceException("Площадка на данное время не свободна");
            }
        } else {
            throw new EventServiceException("Отсутсвуют некоторые данные");
        }
    }

    def List<Event> getPlaceEvents(Place place) {
        return Event.findAllByPlace(place);
    }

    class EventServiceException extends Exception {
        EventServiceException(String s) {
            super(s)
        }
        EventServiceException() {
        }
    }
}
