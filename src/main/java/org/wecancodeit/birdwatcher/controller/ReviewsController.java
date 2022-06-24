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
    public String displayAllReviews(Model model) {
        model.addAttribute("allReviews", reviewsRepo.findAll());
        return("reviews.html");
    }

    @RequestMapping("/single-review/{id}")
    public String displaySingleReview(@PathVariable Long revId, Model model) {
        model.addAttribute("reviews", reviewsRepo.findById(revId).get());
        return ("redirect:/reviews");
    }
}
