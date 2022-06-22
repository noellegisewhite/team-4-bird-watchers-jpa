package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Bird {

    @GeneratedValue (strategy= GenerationType.AUTO)
    @Id
    private Long id;
    private String nameOfBird;
    private String birdImageUrl;
    private String colorOfBird;
    private double lengthOfBeak;
    private double lengthOfWing;
    private String species;
    @Lob
    private String description;
    private String continent;
    private String country;
    private String countryRegion;
    private String habitat;
    private String birdOrder;

    // Getters
    public Long getId() {
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

    public String getBirdOrder() {
        return birdOrder;
    }

    // Empty Constructor
    public Bird(){
    }

    // MVP Constructor
    public Bird(String nameOfBird) {
        this.nameOfBird = nameOfBird;
    }

    public Bird(String nameOfBird, String birdImageUrl, String colorOfBird, double lengthOfBeak, double lengthOfWing,
                String species, String description, String continent, String country, String countryRegion, String habitat, String birdOrder) {
        this.nameOfBird = nameOfBird;
        this.birdImageUrl = birdImageUrl;
        this.colorOfBird = colorOfBird;
        this.lengthOfBeak = lengthOfBeak;
        this.lengthOfWing = lengthOfWing;
        this.species = species;
        this.description = description;
        this.country = country;
        this.continent = continent;
        this.countryRegion = countryRegion;
        this.habitat = habitat;
        this.birdOrder = birdOrder;
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
                ", order='" + birdOrder + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return Double.compare(bird.getLengthOfBeak(), getLengthOfBeak()) == 0 && Double.compare(bird.getLengthOfWing(), getLengthOfWing()) == 0 && getId().equals(bird.getId()) && getNameOfBird().equals(bird.getNameOfBird()) && getBirdImageUrl().equals(bird.getBirdImageUrl()) && getColorOfBird().equals(bird.getColorOfBird()) && getSpecies().equals(bird.getSpecies()) && getDescription().equals(bird.getDescription()) && getContinent().equals(bird.getContinent()) && getCountry().equals(bird.getCountry()) && getCountryRegion().equals(bird.getCountryRegion()) && getHabitat().equals(bird.getHabitat()) && getBirdOrder().equals(bird.getBirdOrder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameOfBird(), getBirdImageUrl(), getColorOfBird(), getLengthOfBeak(), getLengthOfWing(), getSpecies(), getDescription(), getContinent(), getCountry(), getCountryRegion(), getHabitat(), getBirdOrder());
    }
}
