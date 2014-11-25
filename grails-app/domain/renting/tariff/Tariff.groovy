package renting.tariff

import renting.Condition
import renting.place.Place

class Tariff extends Condition {

    static belongsTo = [place:Place];

    static embedded = ['duration']

    static constraints = {
    }
}
