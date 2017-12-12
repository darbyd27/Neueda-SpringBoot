package uk.ac.belfastmet.cereal.respository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.Cereal;


public interface cerealRepository extends CrudRepository<Cereal, Integer> 
{

	Iterable<Cereal> findByCerealId();

}
