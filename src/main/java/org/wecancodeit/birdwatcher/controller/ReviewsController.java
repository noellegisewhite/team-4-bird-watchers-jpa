package org.wecancodeit.birdwatcher.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repository.ReviewsRepository;

import javax.annotation.Resource;

@Controller
public class ReviewsController {
    @Resource
    private ReviewsRepository reviewsRepo;

    @RequestMapping("/reviews")
    public String displayAllReviews(Model model){
        model.addAttribute("allReviews", reviewsRepo.findAll());
        return("reviews.html");
    }

//    @GetMapping("/reviews/{name}")
//    public String displayReviewsByNames(@PathVariable String name, Model model){
//        model.addAttribute("reviewerName", reviewsRepo.findByName(name));
//        return("reviews.html");
//    }
//
//    @GetMapping("/reviews/{ratings}")
//    public String displayReviewsByRatings(@PathVariable int rating, Model model){
//        model.addAttribute("ratings", reviewsRepo.findByRating(rating));
//        return("reviews.html");
//    }
//
//    @GetMapping("/reviews/{tourist-location}")
//    public String displayReviewsByTouristLocation(@PathVariable String touristLocation, Model model){
//        model.addAttribute("touristLocation", reviewsRepo.findByTouristLocation(touristLocation));
//        return("reviews.html");
//    }
//
//    @GetMapping("/reviews/{id}")
//    public String displayOneReviewById(@PathVariable Long id, Model model){
//        model.addAttribute("oneReview", reviewsRepo.findById(id));
//        return ("single-review.html");
//    }
}
