package gadour.springframework.sfgpetclinic.model.bootstrap;

import gadour.springframework.sfgpetclinic.model.model.Owner;
import gadour.springframework.sfgpetclinic.model.model.PetType;
import gadour.springframework.sfgpetclinic.model.model.Vet;
import gadour.springframework.sfgpetclinic.model.services.OwnerService;
import gadour.springframework.sfgpetclinic.model.services.PetTypeService;
import gadour.springframework.sfgpetclinic.model.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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


        Owner owner1 = new Owner();
        owner1.setFirstName("gader");
        owner1.setLastname("lagha");


        ownerService.save(owner1);
        System.out.println("owner data saved ....");

        Vet vet1 = new Vet();
        vet1.setFirstName("salim");
        vet1.setLastname("lajnaf");

        vetService.save(vet1);

        System.out.println("vet data saved ....");

    }
}
