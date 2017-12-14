package uk.ac.belfastmet.titanic.respository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> 
{
	
	
//	<!-- Need code for sarch --> 
	
	
	
	
	
	Iterable<Passenger> findByPclass(int i);
	
	Iterable<Passenger> findBySurvived(int i);
	
	Iterable<Passenger> findByEmbarked(String searchField);
	
	Iterable<Passenger> findByName(String searchField);
	
	Iterable<Passenger> findByNameLike(String searchField);
	
	
	
	
	
	
	//Iterable<Passenger> findBySurvived 
	
	
}
