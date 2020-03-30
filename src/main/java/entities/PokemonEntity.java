package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemons")
public class PokemonEntity {

    @Id
    private Long id;
    private String name;
    private int primary_type;
    private int secondary_type;

    public PokemonEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrimary_type() {
        return primary_type;
    }

    public void setPrimary_type(int primary_type) {
        this.primary_type = primary_type;
    }

    public int getSecondary_type() {
        return secondary_type;
    }

    public void setSecondary_type(int secondary_type) {
        this.secondary_type = secondary_type;
    }
}
