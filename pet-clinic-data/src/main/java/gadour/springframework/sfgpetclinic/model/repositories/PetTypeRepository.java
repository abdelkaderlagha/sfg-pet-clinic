package gadour.springframework.sfgpetclinic.model.repositories;

import gadour.springframework.sfgpetclinic.model.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType , Long> {
}
