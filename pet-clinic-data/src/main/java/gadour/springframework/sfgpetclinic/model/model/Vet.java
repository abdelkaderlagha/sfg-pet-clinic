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
@NoArgsConstructor
@Table(name="vets")
public class Vet extends  Person {

    public Vet(Set<Speciality> speciality) {
        this.speciality = speciality;
    }

    public Vet(Long id, String firstName, String lastname, Set<Speciality> speciality) {
        super(id, firstName, lastname);
        this.speciality = speciality;
    }

    public Vet(String firstName, String lastname, Set<Speciality> speciality) {
        super(firstName, lastname);
        this.speciality = speciality;
    }

    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "vet_specialities" , joinColumns = @JoinColumn(name="vet_is"),inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> speciality = new HashSet<>();


}
