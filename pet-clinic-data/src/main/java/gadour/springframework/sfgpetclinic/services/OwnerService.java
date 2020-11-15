package gadour.springframework.sfgpetclinic.services;


import gadour.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner , Long> {

   Owner findByOwnerName(String lastName);

}
