package org.wecancodeit.birdwatcher;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Destinations {

    @GeneratedValue (strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String country;
    private String region;
    private String habitat;
    private String destinationImageUrl;

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDestinationImageUrl() {
        return destinationImageUrl;
    }

    public Destinations(){
    }

    public Destinations(long id, String country, String region, String habitat, String destinationImageUrl) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.habitat = habitat;
        this.destinationImageUrl = destinationImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destinations)) return false;
        Destinations that = (Destinations) o;
        return getId() == that.getId() && getCountry().equals(that.getCountry()) && getRegion().equals(that.getRegion()) && getHabitat().equals(that.getHabitat()) && getDestinationImageUrl().equals(that.getDestinationImageUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCountry(), getRegion(), getHabitat(), getDestinationImageUrl());
    }

    @Override
    public String toString() {
        return "Destinations{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", habitat='" + habitat + '\'' +
                ", destinationImageUrl='" + destinationImageUrl + '\'' +
                '}';
    }
}
