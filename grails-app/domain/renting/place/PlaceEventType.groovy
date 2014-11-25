package renting.place

import renting.event.EventType

class PlaceEventType {

    static belongsTo = [place:Place,eventType:EventType];

    static constraints = {
    }
}
