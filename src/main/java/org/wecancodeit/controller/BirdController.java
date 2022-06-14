package org.wecancodeit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
