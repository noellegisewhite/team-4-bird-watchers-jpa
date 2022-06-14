package org.wecancodeit.birdwatcher.homepage;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.wecancodeit.birdwatcher.bird.BirdRepository;
import org.wecancodeit.birdwatcher.destination.DestinationsRepository;

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
