package renting.place

import renting.tariff.Tariff

class Place {

    String title;
    String description;
    Capacity capacity;


    static hasMany = [eventTypes:PlaceEventType,tariffs:Tariff];
    
    static constraints = {
        description(nullable: true);
    }
}
