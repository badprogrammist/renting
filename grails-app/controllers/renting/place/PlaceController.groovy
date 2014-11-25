package renting.place

import renting.place.Place

class PlaceController {

    def index() {
    }

    def list() {
        return [places:Place.all];
    }

    def view() {
        return [placeInstance:Place.get(params.id)];
    }
}
