package org.wecancodeit.birdwatcher.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long revId;
    private String revName;
//    @DateTimeFormat(pattern = "MM-dd-yyyy")
//    private LocalDate revDate = LocalDate.now();
    private String revDate;
    private String revTitle;
    @Lob
    private String revText;
    private double revRating;
    private double overallRate;
    private int numOfReviews;
    @ManyToOne
    private Destinations destinations;

    // Getters
    public Long getRevId() {
        return revId;
    }

    public String getRevName() {
        return revName;
    }

    public String getRevDate() {
        return revDate;
    }

    public String getRevTitle() {
        return revTitle;
    }

    public String getRevText() {
        return revText;
    }

    public double getRevRating() {
        return revRating;
    }

    public double getOverallRate() {
        return overallRate;
    }

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public Destinations getDestinations() {
        return destinations;
    }

    // Constructors
    public Reviews() {
    }

    public Reviews(String revName, String revDate, String revTitle, String revText, double revRating, Destinations destinations) {
        this.revName = revName;
        this.revDate = revDate;
        this.revTitle = revTitle;
        this.revText = revText;
        this.revRating = revRating;
        this.destinations = destinations;
    }

    // Methods

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + revId +
                ", revName='" + revName + '\'' +
                ", revDate='" + revDate + '\'' +
                ", revTitle='" + revTitle + '\'' +
                ", revText='" + revText + '\'' +
                ", revRating=" + revRating +
                ", overallRate=" + overallRate +
                ", numOfReviews=" + numOfReviews +
                ", destinations=" + destinations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reviews)) return false;
        Reviews reviews = (Reviews) o;
        return Double.compare(reviews.getRevRating(), getRevRating()) == 0 && Double.compare(reviews.getOverallRate(), getOverallRate()) == 0 && getNumOfReviews() == reviews.getNumOfReviews() && Objects.equals(getRevId(), reviews.getRevId()) && Objects.equals(getRevName(), reviews.getRevName()) && Objects.equals(getRevDate(), reviews.getRevDate()) && Objects.equals(getRevTitle(), reviews.getRevTitle()) && Objects.equals(getRevText(), reviews.getRevText()) && Objects.equals(getDestinations(), reviews.getDestinations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRevId(), getRevName(), getRevDate(), getRevTitle(), getRevText(), getRevRating(), getOverallRate(), getNumOfReviews(), getDestinations());
    }
}

