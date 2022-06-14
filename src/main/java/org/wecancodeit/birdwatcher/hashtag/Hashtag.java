package org.wecancodeit.birdwatcher.hashtag;

import org.wecancodeit.birdwatcher.destination.Destinations;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Hashtag {

    // Variables =============================================================================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tagName;
    @ManyToMany
    private Collection<Destinations> destinations;

    // Getters ===============================================================================
    public Long getId() {
        return id;
    }

    public String getTagName() {
        return tagName;
    }

    public Collection<Destinations> getDestinations() {
        return destinations;
    }

    // Constructors ==========================================================================
    public Hashtag() {
    }

    public Hashtag(String tagName) {
        this.tagName = tagName;
    }

    public Hashtag(String tagName, Destinations...destinations) {
        this.tagName = tagName;
        this.destinations = List.of(destinations);
    }

    // Methods ===============================================================================
    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hashtag)) return false;
        Hashtag hashtag = (Hashtag) o;
        return getId().equals(hashtag.getId()) && getTagName().equals(hashtag.getTagName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTagName());
    }
}
