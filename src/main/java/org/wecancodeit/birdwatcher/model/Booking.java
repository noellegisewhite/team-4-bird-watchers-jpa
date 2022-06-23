package org.wecancodeit.birdwatcher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;
    private String bookName;
    private String bookEmail;
    private String bookPhone;
    @ManyToOne
    private Destinations destinations;
    private String bookStart;
    private String bookEnd;

    // Getters
    public Long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookEmail() {
        return bookEmail;
    }

    public String getBookPhone() {
        return bookPhone;
    }

    public Destinations getDestinations() {
        return destinations;
    }

    public String getBookStart() {
        return bookStart;
    }

    public String getBookEnd() {
        return bookEnd;
    }

    // Constructors
    public Booking() {
    }

    public Booking(String name, String email, String phone, Destinations destinations, String bookStart, String end) {
        this.bookName = name;
        this.bookEmail = email;
        this.bookPhone = phone;
        this.destinations = destinations;
        this.bookStart = bookStart;
        this.bookEnd = end;
    }

    // Methods
    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name='" + bookName + '\'' +
                ", email='" + bookEmail + '\'' +
                ", phone='" + bookPhone + '\'' +
                ", destinations=" + destinations +
                ", start='" + bookStart + '\'' +
                ", end='" + bookEnd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return getId().equals(booking.getId()) && getBookName().equals(booking.getBookName()) && getBookEmail().equals(booking.getBookEmail()) && getBookPhone().equals(booking.getBookPhone()) && getDestinations().equals(booking.getDestinations()) && getBookStart().equals(booking.getBookStart()) && getBookEnd().equals(booking.getBookEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBookName(), getBookEmail(), getBookPhone(), getDestinations(), getBookStart(), getBookEnd());
    }
}
