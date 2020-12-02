package gadour.springframework.sfgpetclinic.model.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="owners")
public class Owner extends  Person{

    @Builder
    public Owner(Long id, String firstName, String lastname, String address_home, String telephone, String city) {
        super(id, firstName, lastname);
    }


    @Column(name="address_home")
    private String address_home;

    @Column(name="telephone")
    private String telephone;

    @Column(name="city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


}
