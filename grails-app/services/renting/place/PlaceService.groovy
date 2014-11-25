package renting.place

import grails.transaction.Transactional
import renting.Duration

@Transactional
class PlaceService {

    def BigDecimal calculatePrice(Duration duration,Place place) {
        return new BigDecimal(10.50);
    }

    def boolean isVacant(Place place, Duration duration, Date eventDate) {
        return true;
    }
}
