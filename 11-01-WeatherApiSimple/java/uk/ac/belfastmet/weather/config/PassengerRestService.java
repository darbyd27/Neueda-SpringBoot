package uk.ac.belfastmet.weather.config;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRestService {

Iterable<Passenger> list();


Passenger create(Passenger passenger);



Passenger read(Integer passenger);

Passenger update(Integer passengerId, Passenger passenger);

void delete(Integer passengerId);


}



