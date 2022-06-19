package org.wecancodeit.birdwatcher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BirdWatchers {

    @GeneratedValue (strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String typeOfBirdWatcher;
    private String birdWatcherDescription;

    public BirdWatchers(long id, String typeOfBirdWatcher, String birdWatcherDescription) {
    }

    public Long getId() {
        return id;
    }

    public String getTypeOfBirdWatcher() {
        return typeOfBirdWatcher;
    }

    public String getBirdWatcherDescription() {
        return birdWatcherDescription;
    }

    public BirdWatchers(){
    }


    public BirdWatchers(String typeOfBirdWatcher, String birdWatcherDescription){
        this.typeOfBirdWatcher = typeOfBirdWatcher;
        this.birdWatcherDescription = birdWatcherDescription;
    }

    @Override
    public String toString() {
        return "BirdWatchers{" +
                "id=" + id +
                ", typeOfBirdWatcher='" + typeOfBirdWatcher + '\'' +
                ", birdWatcherDescription='" + birdWatcherDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BirdWatchers)) return false;
        BirdWatchers that = (BirdWatchers) o;
        return getId().equals(that.getId()) && getTypeOfBirdWatcher().equals(that.getTypeOfBirdWatcher()) && getBirdWatcherDescription().equals(that.getBirdWatcherDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTypeOfBirdWatcher(), getBirdWatcherDescription());
    }
}
