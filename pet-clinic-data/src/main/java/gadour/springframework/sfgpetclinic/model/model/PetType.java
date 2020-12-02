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
@Table(name="types")
public class PetType extends  BaseEntity{

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public PetType(String name) {
        this.name = name;
    }

    @Column(name="name")
    private String name;


}

