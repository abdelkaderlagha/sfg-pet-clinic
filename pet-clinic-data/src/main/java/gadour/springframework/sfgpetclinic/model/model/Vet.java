package gadour.springframework.sfgpetclinic.model.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="vets")
public class Vet extends  Person {

    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "vet_specialities" , joinColumns = @JoinColumn(name="vet_is"),inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> speciality = new HashSet<>();


}
