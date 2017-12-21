package uk.ac.belfastmet.rhi.respository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.rhi.domain.Beneficiary;

public interface RHIRepository extends CrudRepository<Beneficiary, Integer> 
{
}