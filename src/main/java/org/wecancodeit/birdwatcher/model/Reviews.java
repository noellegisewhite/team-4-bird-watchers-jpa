package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Reviews {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;
    private String touristLocation;
    private int rating;
    private String comment;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTouristLocation() {
        return touristLocation;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Reviews(Long id, String name, String touristLocation, int rating, String comment) {
        this.id = id;
        this.name = name;
        this.touristLocation = touristLocation;
        this.rating = rating;
        this.comment = comment;
    }

    public Reviews(){
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", touristLocation='" + touristLocation + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reviews)) return false;
        Reviews reviews = (Reviews) o;
        return getRating() == reviews.getRating() && getId().equals(reviews.getId()) && getName().equals(reviews.getName()) && getTouristLocation().equals(reviews.getTouristLocation()) && getComment().equals(reviews.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTouristLocation(), getRating(), getComment());
    }
}
