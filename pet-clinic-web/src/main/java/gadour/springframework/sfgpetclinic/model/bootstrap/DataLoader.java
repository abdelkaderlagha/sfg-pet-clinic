package gadour.springframework.sfgpetclinic.model.bootstrap;

import gadour.springframework.sfgpetclinic.model.model.Owner;
import gadour.springframework.sfgpetclinic.model.model.Vet;
import gadour.springframework.sfgpetclinic.model.services.OwnerService;
import gadour.springframework.sfgpetclinic.model.services.VetService;
import gadour.springframework.sfgpetclinic.model.services.map.OwnerServiceMap;
import gadour.springframework.sfgpetclinic.model.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("gader");
        owner1.setLastname("lagha");
        owner1.setId(1L);

        ownerService.save(owner1);
        System.out.println("owner data saved ....");

        Vet vet1 = new Vet();
        vet1.setFirstName("salim");
        vet1.setLastname("lajnaf");
        vet1.setId(2L);

        vetService.save(vet1);

        System.out.println("vet data saved ....");

    }
}
