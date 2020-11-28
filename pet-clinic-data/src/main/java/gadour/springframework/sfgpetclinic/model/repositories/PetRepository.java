package gadour.springframework.sfgpetclinic.model.repositories;

import gadour.springframework.sfgpetclinic.model.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
