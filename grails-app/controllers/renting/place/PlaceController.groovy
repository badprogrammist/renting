package renting.place

import renting.event.EventService
import org.springframework.security.access.annotation.Secured

class PlaceController {

    def EventService eventService;

    @Secured(['permitAll'])
    def index() {
    }

    @Secured(['ROLE_USER'])
    def list() {
        return [places:Place.all];
    }

    @Secured(['ROLE_USER'])
    def view() {
        def placeInstance = Place.get(params.id);
        if(placeInstance) {
            def events = eventService.getPlaceEvents(placeInstance);
            return [placeInstance:placeInstance,events:events];
        }

    }
}
