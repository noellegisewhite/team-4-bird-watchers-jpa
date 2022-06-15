package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

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

    // Stretch Task Variables ================================================================
//    @ManyToOne
//    private Collection<Review> reviews;
//    @ManyToOne
//    private Collection<Photos> photos;

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

//    public Collection<Review> getReviews() {
//        return review;
//    }
//
//    public Collection<Photos> getPhotos() {
//        return photos;
//    }

    // Constructors ==========================================================================
    public Destinations() {
    }

    // For Testing Only
    public Destinations(String packageName, Hashtag...hashtags) {
        this.packageName = packageName;
        this.hashtags = List.of(hashtags);
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
    public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc, Hashtag...hashtags) {
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

//    public void addPhoto(Photos photoToAdd) {
//        photos.add(photoToAdd);
//    }
//
//    public void addReview(Review reviewToAdd) {
//        reviews.add(reviewToAdd);
//    }


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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destinations)) return false;
        Destinations that = (Destinations) o;
        return getId().equals(that.getId()) && getPackagePrice().equals(that.getPackagePrice()) && getPackageName().equals(that.getPackageName()) && getPackageCategory().equals(that.getPackageCategory()) && getCountry().equals(that.getCountry()) && getRegion().equals(that.getRegion()) && getHabitat().equals(that.getHabitat()) && getDestinationImageUrl().equals(that.getDestinationImageUrl()) && getPackageDesc().equals(that.getPackageDesc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPackagePrice(), getPackageName(), getPackageCategory(), getCountry(), getRegion(), getHabitat(), getDestinationImageUrl(), getPackageDesc());
    }
}
