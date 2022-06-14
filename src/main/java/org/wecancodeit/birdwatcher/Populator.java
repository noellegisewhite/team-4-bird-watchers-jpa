package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.bird.Bird;
import org.wecancodeit.birdwatcher.bird.BirdRepository;
import org.wecancodeit.birdwatcher.destination.Destinations;
import org.wecancodeit.birdwatcher.destination.DestinationsRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private BirdRepository birdStorage;

    @Resource
    private DestinationsRepository destinationStorage;

    @Override
    public void run(String... args) throws Exception {

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3975.00, "9 Days Africa Wildlife Photographic Private Safari Package", "Safari", "Kenya", "East Africa", "Tropical", "/images/wildlifePhotographicSafari.jpg", "Explore the Tsavo West, Amboseli, Lake Nakuru and Masai Mara ecosystem the best African photo safari destinations, capture the best wildebeest migration experience, an encounter with big cats and large herds of Elephants and other animals. This 9 days Africa Wildlife Photographic Tour Safari offers a great opportunity to view and photograph Africa’s iconic animals – including Elephants, Lions, Cheetahs, Leopards and Giraffes – under expert guidance and tuition from our wildlife photographer guide. Also exciting is a cultural visit to one of the traditional villages and Mount Kilimanjaro breathtaking views. To maximize the amazing photographic opportunities, you simply need to be at the right place, in the right sport at the right time with the sun from just where you need it to be. This requires the services of a specialist guide and driver.");
        Destinations packageTwo = new Destinations(86.99, "Private Dolphin Tour and Snorkeling at Mnemba Island reef", "Snorkeling", "Tanzania", "East Africa", "Tropical", "/images/dolphinTourAndSnorkeling.jpg", "Combine three of Zanzibar’s must-do outdoor adventures into one half-day private tour without all the hassle of having to arrange anything for yourself. Head for the island’s north-eastern waters and watch for dolphins in their natural habitat before snorkeling at Mnemba Island Reef, where corals and clear waters teem with angel fish, rays and other tropical species. Finish at a sandbank to swim in the calm and bright shallows—the perfect finale.");
        destinationStorage.save(packageOne);
        destinationStorage.save(packageTwo);

        Bird birdOne = new Bird("Seagull");
        Bird birdTwo = new Bird("Flamingo");
        birdStorage.save(birdOne);
        birdStorage.save(birdTwo);
    }
}
