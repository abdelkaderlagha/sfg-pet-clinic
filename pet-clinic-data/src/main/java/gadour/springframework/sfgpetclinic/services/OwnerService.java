package gadour.springframework.sfgpetclinic.services;


import gadour.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

   Owner findById(Long id);
   Owner save(Owner owner);
   Set<Owner> findAll();

}
