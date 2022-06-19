package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.Bird;
import org.wecancodeit.birdwatcher.model.BirdWatchers;
import org.wecancodeit.birdwatcher.model.Hashtag;
import org.wecancodeit.birdwatcher.repository.BirdRepository;
import org.wecancodeit.birdwatcher.model.Destinations;
import org.wecancodeit.birdwatcher.repository.BirdWatchersRepository;
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

    @Resource
    private BirdWatchersRepository birdWatchersStorage;

    @Override
    public void run(String... args) throws Exception {

        Hashtag africaTag = new Hashtag("africa");
        Hashtag safariTag = new Hashtag("safari");
        Hashtag oceanTag = new Hashtag("ocean");

        hashtagStorage.save(africaTag);
        hashtagStorage.save(safariTag);
        hashtagStorage.save(oceanTag);

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3975.00, "9 Days Africa Wildlife Photographic Private Safari Package", "Safari", "Kenya", "East", "tropical", "/images/wildlifePhotographicSafari.jpg", "Explore the Tsavo West, Amboseli, Lake Nakuru and Masai Mara ecosystem the best African photo safari destinations, capture the best wildebeest migration experience, an encounter with big cats and large herds of Elephants and other animals. This 9 days Africa Wildlife Photographic Tour Safari offers a great opportunity to view and photograph Africa’s iconic animals – including Elephants, Lions, Cheetahs, Leopards and Giraffes – under expert guidance and tuition from our wildlife photographer guide. Also exciting is a cultural visit to one of the traditional villages and Mount Kilimanjaro breathtaking views. To maximize the amazing photographic opportunities, you simply need to be at the right place, in the right sport at the right time with the sun from just where you need it to be. This requires the services of a specialist guide and driver.");
        Destinations packageTwo = new Destinations(86.99, "Private Dolphin Tour and Snorkeling at Mnemba Island reef", "Snorkeling", "Tanzania", "East", "tropical", "/images/dolphinTourAndSnorkeling.jpg", "Combine three of Zanzibar’s must-do outdoor adventures into one half-day private tour without all the hassle of having to arrange anything for yourself. Head for the island’s north-eastern waters and watch for dolphins in their natural habitat before snorkeling at Mnemba Island Reef, where corals and clear waters teem with angel fish, rays and other tropical species. Finish at a sandbank to swim in the calm and bright shallows—the perfect finale.");

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
        Destinations kenya1 = new Destinations(1444.99, "Kozy Kenya Kayaking", "boat", "Kenya", "East", "coastal", "/images/dest (1).jpg", "Package description");
        Destinations kenya2 = new Destinations(1333.99, "Koastal Retreat", "romantic", "Kenya", "East", "tropical", "/images/dest (2).jpg", "Package description");
        Destinations kenya3 = new Destinations(1222.99, "Kenyan Klimbing", "safari", "Kenya", "East", "mountain", "/images/dest (3).jpg", "Package description");
        Destinations kenya4 = new Destinations(1111.99, "Kamel Trekking In Kenya", "safari", "Kenya", "East", "desert", "/images/dest (4).jpg", "Package description");

        Destinations mad1 = new Destinations(2555.99, "Madagascar Nascar", "safari", "Madagascar", "Island", "desert", "/images/dest (5).jpg", "Package description");
        Destinations mad2 = new Destinations(2444.99, "Madagascar Madness", "boat", "Madagascar", "Island", "coastal", "/images/dest (6).jpg", "Package description");
        Destinations mad3 = new Destinations(2333.99, "Madagascar & Caviar", "luxury", "Madagascar", "Island", "plains", "/images/dest (7).jpg", "Package description");
        Destinations mad4 = new Destinations(2222.99, "Madagascar Under The Stars", "romantic", "Madagascar", "Island", "plains", "/images/dest (8).jpg", "Package description");
        Destinations mad5 = new Destinations(2111.99, "Mornings in Madagascar", "safari", "Madagascar", "Island", "tropical", "/images/dest (9).jpg", "Package description");

        Destinations alge1 = new Destinations(3333.99, "Algeria Pizzaria", "romantic", "Algeria", "North", "tropical", "/images/dest (10).jpg", "Package description");
        Destinations alge2 = new Destinations(3222.99, "Algae in Algeria", "boat", "Algeria", "North", "coastal", "/images/dest (11).jpg", "Package description");
        Destinations alge3 = new Destinations(3111.99, "All Aboard Algeria", "luxury", "Algeria", "North", "coastal", "/images/dest (12).jpg", "Package description");

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

        BirdWatchers watchersA = new BirdWatchers(1, "Ornithologist", "Ornithologist is a name for bird watcher who studies different avian species for professional purposes. This person may or may not have a PhD in biology, but bachelor or master degrees are often a must. Ornithologists are paid to watch birds in order to gather new information about avians.");
        BirdWatchers watchersB = new BirdWatchers(2, "Bird Watchers", "Bird watchers are people who consider birdwatching a hobby, and nothing more. They are amateurs who belong to the beginner level, and their knowledge about birds is just enough to satisfy their hobby.");
        BirdWatchers watchersC = new BirdWatchers(3, "Twitchers", "Bird watchers are called many names, and one of those is twitchers. These hobbyists are willing to spend money on adventures to different places to watch birds in their natural habitats.");
        BirdWatchers watchersD = new BirdWatchers(4, "Birders", "Birder is another bird watching term for people who love watching avians. Birders are committed to their hobby, enough to purchase a couple of tools for birdwatching.");
        BirdWatchers watchersE = new BirdWatchers(5, "Listers", "Another bird watching name is lister. This person makes an extensive list of birds as they perform birdwatching. Listers are known to be obsessed with their list of avians, and they do whatever it takes to constantly update their lifelist.");
        BirdWatchers watchersF = new BirdWatchers(6, "Dude", "A dude is a casual bird watcher who likes watching birds, but it is not a priority for them. They watch avians when the weather is good, and they rarely go to distant spots.");
        BirdWatchers watchersG = new BirdWatchers(7, "Protobirder", "A protobirder is a new term for a person who enjoys birdwatching. Protobirders claim to be super knowledgeable about birds, although whether that’s the case is debatable. This term may be new, but it is starting to be used more often in the birdwatching communities from all over the world.");

        birdWatchersStorage.save(watchersA);
        birdWatchersStorage.save(watchersB);
        birdWatchersStorage.save(watchersC);
        birdWatchersStorage.save(watchersD);
        birdWatchersStorage.save(watchersE);
        birdWatchersStorage.save(watchersF);
        birdWatchersStorage.save(watchersG);

    }
}
