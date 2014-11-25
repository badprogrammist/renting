package renting.event

import renting.place.Place
import renting.Condition

class Event extends Condition {

    EventInfo info;
    Date dateCreated;
    Date eventDate;
    EventType eventType;
    Boolean approve = false;

    static belongsTo = [place:Place];

    static embedded = ['info','duration']

    static constraints = {
    }
}
