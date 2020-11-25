package gadour.springframework.sfgpetclinic.model.services.map;

import gadour.springframework.sfgpetclinic.model.model.Pet;
import gadour.springframework.sfgpetclinic.model.model.PetType;
import gadour.springframework.sfgpetclinic.model.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType , Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);

    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
