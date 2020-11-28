package gadour.springframework.sfgpetclinic.model.repositories;


import gadour.springframework.sfgpetclinic.model.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
