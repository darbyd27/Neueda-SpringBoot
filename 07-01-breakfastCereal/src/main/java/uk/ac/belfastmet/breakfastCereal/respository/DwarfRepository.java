package uk.ac.belfastmet.breakfastCereal.respository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfastCereal.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> 
{

	Iterable<Dwarf> findByAuthor(String string);

}
