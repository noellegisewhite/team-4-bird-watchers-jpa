package org.wecancodeit.birdwatcher.destination;
import org.wecancodeit.birdwatcher.hashtag.Hashtag;
import org.wecancodeit.birdwatcher.review.Review;

import javax.persistence.*;

import java.util.Collection;
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

    // Stretch Task Variables ================================================================
//    @ManyToOne
//    private Collection<Photos> photos;
//    @ManyToOne
//    private Collection<Review> review;
//    @ManyToMany
//    private Collection<Hashtag> hashtag;

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

//    public Collection<Photos> getPhotos() {
//        return photos;
//    }
//
//    public Collection<Review> getReviews() {
//        return review;
//    }
//
//    public Collection<Hashtag> getHashtags() {
//        return hashtag;
//    }

    // Constructors ==========================================================================
    public Destinations() {
    }

    // MVP Controller
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

    // Methods ===============================================================================
//    public void addPhoto(Photos photoToAdd) {
//        photos.add(photoToAdd);
//    }
//
//    public void addReview(Review reviewToAdd) {
//        review.add(reviewToAdd);
//    }
//
//    public void addHashtag(Hashtag hashtagToAdd) {
//        hashtag.add(hashtagToAdd);
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
