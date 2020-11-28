package gadour.springframework.sfgpetclinic.model.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="vets")
public class Vet extends  Person {

    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "vet_specialities" , joinColumns = @JoinColumn(name="vet_is"),inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> speciality = new HashSet<>();

    public Set<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Set<Speciality> speciality) {
        this.speciality = speciality;
    }
}
