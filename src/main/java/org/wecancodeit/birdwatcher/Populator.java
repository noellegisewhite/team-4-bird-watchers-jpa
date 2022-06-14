package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.Bird;
import org.wecancodeit.birdwatcher.repository.BirdRepository;
import org.wecancodeit.birdwatcher.model.Destinations;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private BirdRepository birdStorage;

    @Resource
    private DestinationsRepository destinationStorage;

    @Override
    public void run(String... args) throws Exception {

//        // Dummy Test Data
//        Bird birdOne = new Bird("Seagull");
//        Bird birdTwo = new Bird("Flamingo");
//        birdStorage.save(birdOne);
//        birdStorage.save(birdTwo);

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3975.00, "9 Days Africa Wildlife Photographic Private Safari Package", "Safari", "Kenya", "East Africa", "Tropical", "/images/wildlifePhotographicSafari.jpg", "Explore the Tsavo West, Amboseli, Lake Nakuru and Masai Mara ecosystem the best African photo safari destinations, capture the best wildebeest migration experience, an encounter with big cats and large herds of Elephants and other animals. This 9 days Africa Wildlife Photographic Tour Safari offers a great opportunity to view and photograph Africa’s iconic animals – including Elephants, Lions, Cheetahs, Leopards and Giraffes – under expert guidance and tuition from our wildlife photographer guide. Also exciting is a cultural visit to one of the traditional villages and Mount Kilimanjaro breathtaking views. To maximize the amazing photographic opportunities, you simply need to be at the right place, in the right sport at the right time with the sun from just where you need it to be. This requires the services of a specialist guide and driver.");
        Destinations packageTwo = new Destinations(86.99, "Private Dolphin Tour and Snorkeling at Mnemba Island reef", "Snorkeling", "Tanzania", "East Africa", "Tropical", "/images/dolphinTourAndSnorkeling.jpg", "Combine three of Zanzibar’s must-do outdoor adventures into one half-day private tour without all the hassle of having to arrange anything for yourself. Head for the island’s north-eastern waters and watch for dolphins in their natural habitat before snorkeling at Mnemba Island Reef, where corals and clear waters teem with angel fish, rays and other tropical species. Finish at a sandbank to swim in the calm and bright shallows—the perfect finale.");

        destinationStorage.save(packageOne);
        destinationStorage.save(packageTwo);

        // public Bird(long id, String nameOfBird, String birdImageUrl, String colorOfBird, double lengthOfBeak, double lengthOfWing, String species, String description, String continent, String country, String countryRegion, String habitat)
        Bird birdA = new Bird("Saddle-billed stork", "https://th.bing.com/th?q=Saddle-billed+Stork+Female&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 3, "Ephippiorhynchus senegalensis", "bird", "Africa", "South Africa", "Kruger National Park", "Sub-Saharan Africa");
        Bird birdB = new Bird("Kori Bustard", "https://th.bing.com/th?q=Kori+Bustard+Bird+Wingspan&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 2, "Ardeotis kori", "bird", "Africa", "South Africa", "Kruger National Park", "grasslands");
        Bird birdC = new Bird("Martial Eagle", "https://th.bing.com/th?q=Martial+Eagle+Wings&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 2, "Polemaetus bellicosus", "bird", "Africa", "South Africa", "Kruger National Park", "Sub-Saharan Africa");
        Bird birdD = new Bird("Southern Ground Hornbill", "https://th.bing.com/th?q=Southern+Ground+Hornbill+Baby&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 2, "Bucorvus leadbeateri", "bird", "Africa", "South Africa", "Kruger National Park", "Savanna");
        Bird birdE = new Bird("Pel's Fishing Owl", "https://th.bing.com/th?q=Painting+of+a+Pels+Fishing+Owl&dc=2&w=100&h=100&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 2, "Scotopelia peli", "bird", "Africa", "South Africa", "Kruger National Park", "Rivers and Lakes");
        Bird birdF = new Bird( "Flamingo", "https://th.bing.com/th?q=Flamingo+Fun&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "pink", 2, 2, "Phoeniconaias minor", "bird", "Africa", "Kenya", "Rift Valley", "Soda Lakes");
        Bird birdG = new Bird( "Red-throated bee-eater", "https://th.bing.com/th?q=Red-necked+Bee-eater&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 2, "Merops bulocki", "bird", "Africa", "Kenya", "Rift Valley", "Savannah");
        Bird birdH = new Bird("African emeral cuckoo", "https://th.bing.com/th?q=African+Emerald+Cuckoo+Feeding&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247",
                "black", 2, 2, "Chrysococcyx cupreus", "bird", "Africa", "Kenya", "Rift Valley", "Woodlands");

        birdStorage.save(birdA);
        birdStorage.save(birdA);
        birdStorage.save(birdB);
        birdStorage.save(birdC);
        birdStorage.save(birdD);
        birdStorage.save(birdE);
        birdStorage.save(birdF);
        birdStorage.save(birdG);
        birdStorage.save(birdH);
    }
}
