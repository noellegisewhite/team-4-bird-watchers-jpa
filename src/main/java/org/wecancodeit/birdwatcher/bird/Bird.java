package org.wecancodeit.birdwatcher.bird;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public abstract class Bird {

    @GeneratedValue (strategy= GenerationType.AUTO)
    @Id
    private long id;
    private String nameOfBird;
    private String birdImageUrl;
    private String colorOfBird;
    private double lengthOfBeak;
    private double lengthOfWing;
    private String species;
    private String description;
    private String continent;
    private String country;
    private String countryRegion;
    private String habitat;

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public String getHabitat() {
        return habitat;
    }

    public long getId() {
        return id;
    }

    public String getNameOfBird() {
        return nameOfBird;
    }

    public String getBirdImageUrl() {
        return birdImageUrl;
    }

    public String getColorOfBird() {
        return colorOfBird;
    }

    public double getLengthOfBeak() {
        return lengthOfBeak;
    }

    public double getLengthOfWing() {
        return lengthOfWing;
    }

    public String getSpecies() {
        return species;
    }

    public String getDescription() {
        return description;
    }

    public Bird(){
    }

    public Bird(long id, String nameOfBird, String birdImageUrl, String colorOfBird, double lengthOfBeak, double lengthOfWing, String species,
                String description, String continent, String country, String countryRegion, String habitat) {
        this.id = id;
        this.nameOfBird = nameOfBird;
        this.birdImageUrl = birdImageUrl;
        this.colorOfBird = colorOfBird;
        this.lengthOfBeak = lengthOfBeak;
        this.lengthOfWing = lengthOfWing;
        this.species = species;
        this.description = description;
        this.continent = continent;
        this.country = country;
        this.countryRegion = countryRegion;
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return getId() == bird.getId() && Double.compare(bird.getLengthOfBeak(), getLengthOfBeak()) == 0 && Double.compare(bird.getLengthOfWing(), getLengthOfWing()) == 0 && getNameOfBird().equals(bird.getNameOfBird()) && getBirdImageUrl().equals(bird.getBirdImageUrl()) && getColorOfBird().equals(bird.getColorOfBird()) && getSpecies().equals(bird.getSpecies()) && getDescription().equals(bird.getDescription()) && getContinent().equals(bird.getContinent()) && getCountry().equals(bird.getCountry()) && getCountryRegion().equals(bird.getCountryRegion()) && getHabitat().equals(bird.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameOfBird(), getBirdImageUrl(), getColorOfBird(), getLengthOfBeak(), getLengthOfWing(), getSpecies(), getDescription(), getContinent(), getCountry(), getCountryRegion(), getHabitat());
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", nameOfBird='" + nameOfBird + '\'' +
                ", birdImageUrl='" + birdImageUrl + '\'' +
                ", colorOfBird='" + colorOfBird + '\'' +
                ", lengthOfBeak=" + lengthOfBeak +
                ", lengthOfWing=" + lengthOfWing +
                ", species='" + species + '\'' +
                ", description='" + description + '\'' +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", countryRegion='" + countryRegion + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
