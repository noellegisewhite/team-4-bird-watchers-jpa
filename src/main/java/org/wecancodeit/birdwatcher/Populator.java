package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.destination.Destinations;
import org.wecancodeit.birdwatcher.destination.DestinationsRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private DestinationsRepository destinationStorage;

    @Override
    public void run(String... args) throws Exception {

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3999.99, "Kenya Luxury Safari Tour", "luxury", "Kenya", "Region", "Rainforest", "https://images.pexels.com/photos/1233286/pexels-photo-1233286.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "This is a description");
        Destinations packageTwo = new Destinations(4499.99, "Tanzania Private Island Tour", "beach", "Tanzania", "Island", "Island", "https://images.pexels.com/photos/1174732/pexels-photo-1174732.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "This is another cool description");
        destinationStorage.save(packageOne);
        destinationStorage.save(packageTwo);
    }
}
