package org.wecancodeit.birdwatcher.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

@Entity
public class Destinations {

    // Variables =============================================================================
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Double packagePrice;
    private String packageName;
    private String packageCategory;
    private String country;
    private String region;
    private String habitat;
    private String destinationImageUrl;
    @Lob // Longer text allowance
    private String packageDesc;
    @ManyToMany
    private Collection<Hashtag> hashtags;
    @ManyToMany
    private Collection<Bird> bird;
    @OneToMany(mappedBy = "destinations")
    private Set<Booking> bookings = new HashSet<>();
    @OneToMany(mappedBy = "destinations")
    private Set<Reviews> reviews = new HashSet<>();

//     Stretch Task Variables ================================================================
//    @OneToOne(mappedBy = "gallDest")
//    private Gallery gallery;

    // Getters ===============================================================================
    public Long getId() {
        return id;
    }

    public Double getPackagePrice() {
        return packagePrice;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getPackageCategory() {
        return packageCategory;
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

    public String getPackageDesc() {
        return packageDesc;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public Collection<Bird> getBird() {
        return bird;
    }

    public Collection<Booking> getBookings() {
        return bookings;
    }

    public Collection<Reviews> getReviews() {
        return reviews;
    }

    // Constructors ==========================================================================
    public Destinations() {
    }

    // For Testing Only
    public Destinations(String packageName, Hashtag...hashtags) {
        this.packageName = packageName;
        this.hashtags = new HashSet<>();
    }

    // Minimal Controller
    public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc) {
        this.packagePrice = packagePrice;
        this.packageName = packageName;
        this.packageCategory = packageCategory;
        this.country = country;
        this.region = region;
        this.habitat = habitat;
        this.destinationImageUrl = destinationImageUrl;
        this.packageDesc = packageDesc;
    }

    // Stretch Constructor With Hashtags
    // this.hashtags = new HashSet<>();
    public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc ,Hashtag...hashtags) {
        this.packagePrice = packagePrice;
        this.packageName = packageName;
        this.packageCategory = packageCategory;
        this.country = country;
        this.region = region;
        this.habitat = habitat;
        this.destinationImageUrl = destinationImageUrl;
        this.packageDesc = packageDesc;
        this.hashtags = List.of(hashtags);
    }

    // Methods ===============================================================================
    public void addOneHashtag(Hashtag hashtagToAdd) {
        hashtags.add(hashtagToAdd);
    }

    @Override
    public String toString() {
        return "Destinations{" +
                "id=" + id +
                ", packagePrice=" + packagePrice +
                ", packageName='" + packageName + '\'' +
                ", packageCategory='" + packageCategory + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", habitat='" + habitat + '\'' +
                ", destinationImageUrl='" + destinationImageUrl + '\'' +
                ", packageDesc='" + packageDesc + '\'' +
                ", hashtags=" + hashtags +
                ", bird=" + bird +
                ", bookings=" + bookings +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destinations)) return false;
        Destinations that = (Destinations) o;
        return getId().equals(that.getId()) && getPackagePrice().equals(that.getPackagePrice()) && getPackageName().equals(that.getPackageName()) && getPackageCategory().equals(that.getPackageCategory()) && getCountry().equals(that.getCountry()) && getRegion().equals(that.getRegion()) && getHabitat().equals(that.getHabitat()) && getDestinationImageUrl().equals(that.getDestinationImageUrl()) && getPackageDesc().equals(that.getPackageDesc()) && getHashtags().equals(that.getHashtags()) && getBird().equals(that.getBird()) && getBookings().equals(that.getBookings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPackagePrice(), getPackageName(), getPackageCategory(), getCountry(), getRegion(), getHabitat(), getDestinationImageUrl(), getPackageDesc(), getHashtags(), getBird());
    }
}
