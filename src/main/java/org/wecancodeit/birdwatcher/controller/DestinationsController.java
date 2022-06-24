package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import org.wecancodeit.birdwatcher.model.Destinations;
import org.wecancodeit.birdwatcher.model.Reviews;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;
import org.wecancodeit.birdwatcher.repository.ReviewsRepository;

import java.time.LocalDate;

@Controller
public class DestinationsController {

    @Resource
    private DestinationsRepository destinationsRepo;

    @Resource
    private ReviewsRepository reviewsRepo;

    @RequestMapping ("/destinations")
    public String displayAllDestinations(Model model) {
        model.addAttribute("allDestinations", destinationsRepo.findAll());
        return ("all-destinations-template.html"); // HTML File name
    }

    @GetMapping ("/destinations/{country}")
    public String displayOneDestinationByCountry(@PathVariable String country, Model model) {
        model.addAttribute("countryDestination", destinationsRepo.findByCountry(country));
        return ("all-destinations-template.html");
    }

    @GetMapping("/destinations/{region}")
    public String displayOneDestinationByRegion(@PathVariable String region, Model model) {
        model.addAttribute("regionDestination", destinationsRepo.findByRegion(region));
        return ("all-destinations-template.html");
    }

    @GetMapping("/destinations/{habitat}")
    public String displayOneDestinationByHabitat(@PathVariable String habitat, Model model){
        model.addAttribute("habitatDestination", destinationsRepo.findByHabitat(habitat));
        return ("all-destinations-template.html");
    }

    @RequestMapping("/single-destination/{id}")
    public String displayOneDestinationById(@PathVariable Long id, Model model) {
        model.addAttribute("singleDestination", destinationsRepo.findById(id).get());
        return ("single-destination-template.html");
    }

    @PostMapping("/addReview")
    public String addReview(@RequestParam String revName, @RequestParam String revDate, @RequestParam String revTitle, @RequestParam String revText, @RequestParam double revRating, @RequestParam Long id, Model model) {
        Destinations newDestination = destinationsRepo.findById(id).get();
        Reviews newReview = new Reviews(revName, revDate, revTitle, revText, revRating, newDestination);
        reviewsRepo.save(newReview);
        destinationsRepo.save(newDestination);
        model.addAttribute("reviews", newReview);
        return ("redirect:/single-destination/" + id + "#reviews");
    }
}
