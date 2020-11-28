package gadour.springframework.sfgpetclinic.model.bootstrap;

import gadour.springframework.sfgpetclinic.model.model.*;
import gadour.springframework.sfgpetclinic.model.services.OwnerService;
import gadour.springframework.sfgpetclinic.model.services.PetTypeService;
import gadour.springframework.sfgpetclinic.model.services.SpecialityService;
import gadour.springframework.sfgpetclinic.model.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }


    @Override
    public void run(String... args) throws Exception {


        int count = petTypeService.findAll().size();

        if(count == 0) {
            data();
        }
    }

    private void data() {
        PetType dog = new PetType();
        dog.setName("boby");

        petTypeService.save(dog);
        System.out.println("petType data saved ....");


        Speciality speciality = new Speciality();
        speciality.setDescription("Medicine");

        specialityService.save(speciality);


        Owner owner1 = new Owner();
        owner1.setFirstName("gader");
        owner1.setLastname("lagha");
        owner1.setAddress_home("houma souri");
        owner1.setCity("korba");
        owner1.setTelephone("22222");


        ownerService.save(owner1);
        System.out.println("owner data saved ....");


        Pet gederPet = new Pet();
        gederPet.setPetType(dog);
        gederPet.setOwner(owner1);
        gederPet.setDate(LocalDate.now());
        gederPet.setName("boby");
        owner1.getPets().add(gederPet);

        Vet vet1 = new Vet();
        vet1.setFirstName("salim");
        vet1.setLastname("lajnaf");
        vet1.getSpeciality().add(speciality);

        vetService.save(vet1);

        System.out.println("vet data saved ....");
    }
}
