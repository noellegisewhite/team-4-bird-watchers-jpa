package org.wecancodeit.birdwatcher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;

import javax.annotation.Resource;

@Controller
public class DestinationsController {

    @Resource
    private DestinationsRepository destinationsRepo;

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

    @GetMapping ("/single-destination/{id}")
    public String displayOneDestinationById(@PathVariable Long id, Model model) {
        model.addAttribute("singleDestination", destinationsRepo.findById(id));
        return ("single-destination-template.html");
    }
}
