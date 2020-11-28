package gadour.springframework.sfgpetclinic.model.repositories;

import gadour.springframework.sfgpetclinic.model.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
