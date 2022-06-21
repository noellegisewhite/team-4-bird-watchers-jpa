package org.wecancodeit.birdwatcher.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String revName;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private String revDate;
    private String revTitle;
    @Lob
    private String revText;
    private double revRating;
    private double overallRate;

    // Constructors
    public Reviews() {
    }

    public Reviews(String revName, String revDate, String revTitle, String revText, double revRating, double overallRate) {
        this.revName = revName;
        this.revDate = revDate;
        this.revTitle = revTitle;
        this.revText = revText;
        this.revRating = revRating;
        this.overallRate = overallRate;
    }
}

