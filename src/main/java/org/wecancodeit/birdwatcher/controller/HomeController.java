package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import org.wecancodeit.birdwatcher.model.Booking;
import org.wecancodeit.birdwatcher.model.Destinations;
import org.wecancodeit.birdwatcher.repository.BirdRepository;
import org.wecancodeit.birdwatcher.repository.BookingRepository;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;

@Controller
public class HomeController {

    @Resource
    private BirdRepository birdRepo;

    @Resource
    private DestinationsRepository destinationRepo;

    @Resource
    private BookingRepository bookingRepo;

    @GetMapping("/")
    public String displayHomeBirds(Model model) {
        model.addAttribute("birdModel", birdRepo.findAll());
        model.addAttribute("destinationModel", destinationRepo.findAll());
        return ("home-template");
    }

    @GetMapping("/about")
    public String displayAboutPage() {
        return ("about-template.html");
    }

    @GetMapping("/company")
    public String displayCompanyPage() {
        return ("company-template.html");
    }

    @GetMapping("/reviews")
    public String displayReviewsPage(Model model) {
        return ("reviews.html");
    }

    @GetMapping("/test")
    public String displayTest(Model model) {
        return ("z-global-template.html");
    }


    @PostMapping("/addBooking")
    public String addBooking(@RequestParam String bookName, @RequestParam String bookEmail, @RequestParam String bookPhone, @RequestParam Long id, @RequestParam String bookStart, @RequestParam String bookEnd, Model model) {
        Destinations bookingDest = destinationRepo.findById(id).get();
        Booking newBooking = new Booking(bookName, bookEmail, bookPhone, bookingDest, bookStart, bookEnd);
        bookingRepo.save(newBooking);
        destinationRepo.save(bookingDest);
        model.addAttribute("booking", newBooking);
        model.addAttribute("destinations", bookingDest);
        return ("bookings.html");
    }
}
