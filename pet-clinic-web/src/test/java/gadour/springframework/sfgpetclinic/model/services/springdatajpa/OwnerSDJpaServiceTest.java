package gadour.springframework.sfgpetclinic.model.services.springdatajpa;

import gadour.springframework.sfgpetclinic.model.model.Owner;
import gadour.springframework.sfgpetclinic.model.model.PetType;
import gadour.springframework.sfgpetclinic.model.repositories.OwnerRepository;
import gadour.springframework.sfgpetclinic.model.repositories.PetRepository;
import gadour.springframework.sfgpetclinic.model.repositories.PetTypeRepository;
import gadour.springframework.sfgpetclinic.model.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
        Set<Owner> RownerSet = new HashSet<>();

        RownerSet.add(Owner.builder().id(2L).build());
        RownerSet.add(Owner.builder().id(3L).build());

        when(ownerRepository.findAll()).thenReturn(RownerSet);
        Set<Owner> owners = service.findAll();

        assertEquals(2,owners.size());

    }

    @Test
    void findById() {
        Owner gadour = Owner.builder().id(2L).build();

        when(ownerRepository.findById(any())).thenReturn(Optional.of(gadour));

        Owner owner = service.findById(2L);
        assertNotNull(owner);


    }

    @Test
    void save() {
        Owner gadour = Owner.builder().id(2L).build();

        when(ownerRepository.save(any())).thenReturn(gadour);

        service.save(gadour);

        assertNotNull(gadour);


    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByOwnerName() {

    }
}