package gadour.springframework.sfgpetclinic.model.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="specialities")
public class Speciality extends  BaseEntity {

    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    public Speciality(String description) {
        this.description = description;
    }

    @Column(name="description")
    private String description;


}
