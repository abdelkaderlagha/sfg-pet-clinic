package gadour.springframework.sfgpetclinic.model.services;


import gadour.springframework.sfgpetclinic.model.model.Owner;

public interface OwnerService extends CrudService<Owner , Long> {

   Owner findByOwnerName(String lastName);

}
