import renting.Duration
import renting.place.Capacity
import renting.Period
import renting.event.EventType
import renting.place.Place
import renting.place.PlaceEventType
import renting.tariff.Tariff

class BootStrap {

    def init = { servletContext ->
        def place1 = new Place(title:"Транзистор",capacity: Capacity.LESS_TEN);
        def place2 = new Place(title:"Галактика",description: "Описание галактической империи",capacity: Capacity.FROM_TEN_TO_TWENTY);

        def et1 = new EventType(title: "Лекция").save();
        def et2 = new EventType(title: "Выставка").save();
        def et3 = new EventType(title: "Тренинг").save();
        def et4 = new EventType(title: "Фотосъемка").save();
        new EventType(title: "Переговоры").save();
        new EventType(title: "Видеопоказ").save();
        new EventType(title: "Вечеринка").save();
        new EventType(title: "Концерт").save();
        new EventType(title: "Спорт и фитнес").save();
        new EventType(title: "Работа").save();
        place1.addToEventTypes(new PlaceEventType(place: place1,eventType: et1));
        place1.addToEventTypes(new PlaceEventType(place: place1,eventType: et2));
        place1.addToEventTypes(new PlaceEventType(place: place1,eventType: et3));
        place1.addToTariffs(new Tariff(duration: new Duration(period:Period.HOUR,count: 1), rent: 3000.00));
        place1.save();
        place2.addToEventTypes(new PlaceEventType(place: place2,eventType: et2));
        place2.addToEventTypes(new PlaceEventType(place: place2,eventType: et3));
        place2.addToEventTypes(new PlaceEventType(place: place2,eventType: et4));
        place2.addToTariffs(new Tariff(duration: new Duration(period:Period.HOUR,count: 1), rent: 2000.00));
        place2.addToTariffs(new Tariff(duration: new Duration(period:Period.DAY,count: 1), rent: 16000.00));
        place2.save();
    }
    def destroy = {
    }
}
