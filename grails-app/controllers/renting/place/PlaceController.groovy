package renting.place

import renting.event.EventService
import renting.place.Place

class PlaceController {

    def EventService eventService;

    def index() {
    }



    def list() {
        return [places:Place.all];
    }

    def view() {
        def placeInstance = Place.get(params.id);
        if(placeInstance) {
            def events = eventService.getPlaceEvents(placeInstance);
            return [placeInstance:placeInstance,events:events];
        }

    }
}
