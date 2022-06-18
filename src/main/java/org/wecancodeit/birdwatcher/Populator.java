package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.Bird;
import org.wecancodeit.birdwatcher.model.Hashtag;
import org.wecancodeit.birdwatcher.repository.BirdRepository;
import org.wecancodeit.birdwatcher.model.Destinations;
import org.wecancodeit.birdwatcher.repository.DestinationsRepository;
import org.wecancodeit.birdwatcher.repository.HashtagRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private BirdRepository birdStorage;

    @Resource
    private DestinationsRepository destinationStorage;

    @Resource
    private HashtagRepository hashtagStorage;

    @Override
    public void run(String... args) throws Exception {

        Hashtag africaTag = new Hashtag("africa");
        Hashtag safariTag = new Hashtag("safari");
        Hashtag oceanTag = new Hashtag("ocean");

        hashtagStorage.save(africaTag);
        hashtagStorage.save(safariTag);
        hashtagStorage.save(oceanTag);

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3975.00, "9 Days Africa Wildlife Photographic Private Safari Package", "Safari", "Kenya", "East", "plains", "/images/wildlifePhotographicSafari.jpg", "Explore the Tsavo West, Amboseli, Lake Nakuru and Masai Mara ecosystem the best African photo safari destinations, capture the best wildebeest migration experience, an encounter with big cats and large herds of Elephants and other animals. This 9 days Africa Wildlife Photographic Tour Safari offers a great opportunity to view and photograph Africa’s iconic animals – including Elephants, Lions, Cheetahs, Leopards and Giraffes – under expert guidance and tuition from our wildlife photographer guide. Also exciting is a cultural visit to one of the traditional villages and Mount Kilimanjaro breathtaking views. To maximize the amazing photographic opportunities, you simply need to be at the right place, in the right sport at the right time with the sun from just where you need it to be. This requires the services of a specialist guide and driver.");
        Destinations packageTwo = new Destinations(86.99, "Private Dolphin Tour and Snorkeling at Mnemba Island reef", "Snorkeling", "Tanzania", "East", "coastal", "/images/dolphinTourAndSnorkeling.jpg", "Combine three of Zanzibar’s must-do outdoor adventures into one half-day private tour without all the hassle of having to arrange anything for yourself. Head for the island’s north-eastern waters and watch for dolphins in their natural habitat before snorkeling at Mnemba Island Reef, where corals and clear waters teem with angel fish, rays and other tropical species. Finish at a sandbank to swim in the calm and bright shallows—the perfect finale.");

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

        // Dummy Data
        Destinations kenya1 = new Destinations(1444.99, "Kamel Trekking In Kenya", "safari", "Kenya", "East", "plains", "/images/dest (1).jpg", "Package description");
        Destinations kenya2 = new Destinations(1333.99, "Koastal Retreat", "luxury", "Kenya", "East", "tropical", "/images/dest (2).jpg", "Package description");
        Destinations kenya3 = new Destinations(1222.99, "Kozy Kenya Kayaking", "romantic", "Kenya", "East", "coastal", "/images/dest (3).jpg", "Package description");
        Destinations kenya4 = new Destinations(1111.99, "Kenya Kove", "luxury", "Kenya", "East", "coastal", "/images/dest (4).jpg", "Package description");

        Destinations mad1 = new Destinations(2555.99, "Madagascar Nascar", "safari", "Madagascar", "Island", "tropical", "/images/dest (5).jpg", "Package description");
        Destinations mad2 = new Destinations(2444.99, "Madagascar Madness", "boat", "Madagascar", "Island", "coastal", "/images/dest (6).jpg", "Package description");
        Destinations mad3 = new Destinations(2333.99, "Madagascar & Caviar", "luxury", "Madagascar", "Island", "coastal", "/images/dest (7).jpg", "Package description");
        Destinations mad4 = new Destinations(2222.99, "Madagascar Under The Stars", "romantic", "Madagascar", "Island", "mountain", "/images/dest (8).jpg", "Package description");
        Destinations mad5 = new Destinations(2111.99, "Mornings in Madagascar", "boat", "Madagascar", "Island", "tropical", "/images/dest (9).jpg", "Package description");

        Destinations alge1 = new Destinations(3333.99, "Algeria Pizzaria", "romantic", "Algeria", "North", "mountain", "/images/dest (10).jpg", "Package description");
        Destinations alge2 = new Destinations(3222.99, "Alpines of Algeria", "safari", "Algeria", "North", "mountain", "/images/dest (11).jpg", "Package description");
        Destinations alge3 = new Destinations(3111.99, "Algerian Mysteries", "safari", "Algeria", "North", "desert", "/images/dest (12).jpg", "Package description");

        destinationStorage.save(kenya1);
        destinationStorage.save(kenya2);
        destinationStorage.save(kenya3);
        destinationStorage.save(kenya4);

        destinationStorage.save(mad1);
        destinationStorage.save(mad2);
        destinationStorage.save(mad3);
        destinationStorage.save(mad4);
        destinationStorage.save(mad5);

        destinationStorage.save(alge1);
        destinationStorage.save(alge2);
        destinationStorage.save(alge3);
    }
}
