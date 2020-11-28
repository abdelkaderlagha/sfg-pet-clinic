package gadour.springframework.sfgpetclinic.model.services;

import gadour.springframework.sfgpetclinic.model.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitService extends CrudService<Visit , Long> {
}
