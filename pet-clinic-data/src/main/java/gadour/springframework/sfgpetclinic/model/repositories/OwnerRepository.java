package gadour.springframework.sfgpetclinic.model.repositories;

import gadour.springframework.sfgpetclinic.model.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findBylastname(String lastname);
}
