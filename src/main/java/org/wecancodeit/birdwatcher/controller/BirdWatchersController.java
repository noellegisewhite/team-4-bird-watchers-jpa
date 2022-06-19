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

    @RequestMapping("/birdwatchers")
    public String displayAllBirdWatchers(Model model){
        model.addAttribute("allBirdWatchers", birdWatchersRepo.findAll());
        return ("bird-watchers.html");
    }
}
