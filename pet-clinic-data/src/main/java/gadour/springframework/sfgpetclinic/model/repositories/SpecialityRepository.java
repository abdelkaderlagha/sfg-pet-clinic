package gadour.springframework.sfgpetclinic.model.repositories;

import gadour.springframework.sfgpetclinic.model.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality , Long> {
}
