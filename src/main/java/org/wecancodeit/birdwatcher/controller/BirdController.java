package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repository.BirdRepository;

import javax.annotation.Resource;

@Controller
public class BirdController {

    @Resource
    private BirdRepository birdRepo;

    @GetMapping("/birds")
    public String displayAllBirds(Model model) {
        model.addAttribute("allBirds", birdRepo.findAll());
        return ("all-birds-template.html");
    }

    @GetMapping("/single-bird/{id}")
    public String displaySingleBirds(@PathVariable Long id, Model model) {
        model.addAttribute("singleBird", birdRepo.findById(id));
        return ("single-bird-template.html");
    }

    @RequestMapping("/bird/country")
    public String displayBirdByCountry(@PathVariable String country, Model model) {
        model.addAttribute("countryBird", birdRepo.findByCountry(country));
        return ("all-birds-template.html");
    }

    @RequestMapping("/bird/region")
    public String displayBirdByRegion(@PathVariable String region, Model model) {
        model.addAttribute("regionBird", birdRepo.findByCountryRegion(region));
        return ("all-birds-template.html");
    }

    @RequestMapping("/bird/habitat")
    public String displayBirdByHabitat(@PathVariable String habitat, Model model) {
        model.addAttribute("habitatBird", birdRepo.findByHabitat(habitat));
        return ("all-birds-template.html");
    }
}
