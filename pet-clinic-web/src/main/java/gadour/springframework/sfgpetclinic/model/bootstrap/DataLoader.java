package gadour.springframework.sfgpetclinic.model.bootstrap;

import gadour.springframework.sfgpetclinic.model.model.Owner;
import gadour.springframework.sfgpetclinic.model.model.Pet;
import gadour.springframework.sfgpetclinic.model.model.PetType;
import gadour.springframework.sfgpetclinic.model.model.Vet;
import gadour.springframework.sfgpetclinic.model.services.OwnerService;
import gadour.springframework.sfgpetclinic.model.services.PetTypeService;
import gadour.springframework.sfgpetclinic.model.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("boby");

        petTypeService.save(dog);
        System.out.println("petType data saved ....");





        Owner owner1 = new Owner();
        owner1.setFirstName("gader");
        owner1.setLastname("lagha");
        owner1.setAdress("houma souri");
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

        vetService.save(vet1);

        System.out.println("vet data saved ....");

    }
}
