package gadour.springframework.sfgpetclinic.model.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="owners")
public class Owner extends  Person{

    @Column(name="address_home")
    private String address_home;

    @Column(name="telephone")
    private String telephone;

    @Column(name="city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


}
