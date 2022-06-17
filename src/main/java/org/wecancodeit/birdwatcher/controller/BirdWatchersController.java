package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repository.BirdWatchersRepository;

import javax.annotation.Resource;

@Controller
public class BirdWatchersController {

    @Resource
    private BirdWatchersRepository birdWatchersRepo;

    @RequestMapping("/birdWatchers")
    public String displayAllBirdWatchers(Model model){
        model.addAttribute("allBirdWatchers", birdWatchersRepo.findAll());
        return ("all-bird-watchers-template.html");
    }

    @GetMapping("/birdWatchers/{typeOfBirdWatcher}")
    public String displayOneBirdWatcherByTypeOfBirdWatcher(@PathVariable String typeOfBirdWatcher, Model model) {
        model.addAttribute("typeOfBirdWatcher", birdWatchersRepo.findByTypeOfBirdWatcher(typeOfBirdWatcher));
        return ("all-bird-watchers-template.html");
    }

    @GetMapping("/single-birdWatcher/{id}")
    public String displayOneBirdWatcherById(@PathVariable Long id, Model model) {
        model.addAttribute("singleBirdWatcher", birdWatchersRepo.findById(id));
        return ("single-birdWatcher-template.html");
    }
}
