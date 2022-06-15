package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.wecancodeit.birdwatcher.repository.BirdRepository;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;

@Controller
public class HomeController {

    @Resource
    private BirdRepository birdRepo;

    @Resource
    private DestinationsRepository destinationRepo;

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
}
