package entities;

import javax.persistence.Basic;
import javax.persistence.Column;

import javax.persistence.*;

@Entity
@Table(name = "pokemon_trainer")
public class PokemonTrainerEntity {

    @Id
    private Integer trainerId;
    private Integer pokeLevel;
    private Integer hp;
    private Integer maxhp;
    private Integer attack;
    private Integer defense;
    private Integer spatk;
    private Integer spdef;
    private Integer speed;
    private Integer pokemon_id;


    public PokemonTrainerEntity(Integer trainerId, Integer pokeLevel, Integer hp, Integer maxhp, Integer attack, Integer defense, Integer spatk, Integer spdef, Integer speed, Integer pokemon_id) {
        this.trainerId = trainerId;
        this.pokeLevel = pokeLevel;
        this.hp = hp;
        this.maxhp = maxhp;
        this.attack = attack;
        this.defense = defense;
        this.spatk = spatk;
        this.spdef = spdef;
        this.speed = speed;
        this.pokemon_id = pokemon_id;
    }

    public PokemonTrainerEntity() {
    }

    @Basic
    @Column(name = "trainerid")
    public Integer getTrainerId(){
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "pokelevel")
    public Integer getPokeLevel() {
        return pokeLevel;
    }

    public void setPokeLevel(Integer pokeLevel) {
        this.pokeLevel = pokeLevel;
    }

    @Basic
    @Column(name = "hp")
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "maxhp")
    public Integer getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(Integer maxhp) {
        this.maxhp = maxhp;
    }

    @Basic
    @Column(name = "attack")
    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    @Basic
    @Column(name = "defense")
    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @Basic
    @Column(name = "spatk")
    public Integer getSpatk() {
        return spatk;
    }

    public void setSpatk(Integer spatk) {
        this.spatk = spatk;
    }

    @Basic
    @Column(name = "spdef")
    public Integer getSpdef() {
        return spdef;
    }

    public void setSpdef(Integer spdef) {
        this.spdef = spdef;
    }

    @Basic
    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "pokemon_id")
    public Integer getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Integer pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    @Override
    public String toString() {
        return "PokemonTrainerEntity{" +
                "trainerId=" + trainerId +
                ", pokeLevel=" + pokeLevel +
                ", hp=" + hp +
                ", maxhp=" + maxhp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spatk=" + spatk +
                ", spdef=" + spdef +
                ", speed=" + speed +
                ", pokemon_id=" + pokemon_id +
                '}';
    }
}
