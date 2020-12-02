package gadour.springframework.sfgpetclinic.model.services.map;

import gadour.springframework.sfgpetclinic.model.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    Set<Owner> ownerSet;


    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        Owner gadour = Owner.builder().id(2L).firstName("gadour").build();
        Owner hela = Owner.builder().id(3L).firstName("hela").build();
        ownerServiceMap.save(gadour);
        ownerServiceMap.save(hela);
    }

    @Test
    void findAll() {
        assertEquals(2, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(2L);
        assertEquals(1,ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByOwnerName() {
    }
}