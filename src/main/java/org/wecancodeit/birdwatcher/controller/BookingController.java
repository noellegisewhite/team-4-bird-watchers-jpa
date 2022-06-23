package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repository.BookingRepository;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;

import javax.annotation.Resource;

@Controller
public class BookingController {

    @Resource
    private BookingRepository bookingRepo;

    @Resource
    private DestinationsRepository destinationsRepo;

    @RequestMapping("/bookings")
    public String displayAllBookings(Model model) {
        model.addAttribute("allBookings", bookingRepo.findAll());
        return ("bookings.html");
    }

}
