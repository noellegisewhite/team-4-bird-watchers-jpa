package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.*;
import org.wecancodeit.birdwatcher.repository.*;

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
        Hashtag tropicalTag = new Hashtag("tropical");
        Hashtag luxuryTag = new Hashtag("luxury");

        hashtagStorage.save(africaTag);
        hashtagStorage.save(safariTag);
        hashtagStorage.save(oceanTag);
        hashtagStorage.save(tropicalTag);
        hashtagStorage.save(luxuryTag);
        hashtagStorage.findAll();

        // public Bird(long id, String nameOfBird, String birdImageUrl, String colorOfBird, double lengthOfBeak, double lengthOfWing, String species, String description, String continent, String country, String countryRegion, String habitat)
        Bird birdA = new Bird("Saddle-Billed Stork", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/220922121/1200",
                "black", 2, 3, "Ephippiorhynchus Senegalensis", "This is a huge bird that regularly attains a height of 145 to 150 cm, a length of 142 cm and 2.4 to 2.7 m wingspan. The head, neck, back, wings, and tail are iridescent black, with the rest of the body and the primary flight feather being white. The massive bill is red with a black band and a yellow frontal shield. The legs and feet are black with pink hocks. On the chest is a bare red patch of skin, whose colour darkens during the breeding season.", "Africa", "east africa", "kruger national park", "sahara");
        Bird birdB = new Bird("Kori Bustard", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/218717931/1200",
                "brown", 2, 2, "Ardeotis Kori", "They are the world's heaviest flying birds. These birds are omnivorous, although they tend to be more carnivorous than other species of bustards. Insects form a large portion of their diet, especially when they are chicks. They also eat a variety of small mammals, lizards, snakes, seeds and berries. During the height of the mating display, the male inflates his esophagus to as much as four times its normal size. The tail feathers are cocked to reveal as much of the white under feathers as possible. The wings may droop down so much that the tips of the primaries touch the ground. During direct courtship of a female, the male will bow toward her with his neck inflated and bill snapping. He may also emit a low pitched booming sound.", "Africa", "south africa", "kruger national park", "grasslands");
        Bird birdC = new Bird("Martial Eagle", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/218877601/1200",
                "brown", 2, 2, "Polemaetus Bellicosus", "Martial eagles are diurnal, often spending a large portion of the day on the wing, and often at a great height. When not breeding, both mature eagles from a breeding pair may be found roosting on their own in some tree up to several miles from their nesting haunt, probably hunting for several days in one area, and then moving on to another area. Martial eagles usually hunt in a long, shallow stoop, however, when the quarry is seen in a more enclosed space, they parachute down to a relatively steeper angle. These type of birds tend to be solitary and do not tolerate other eagles in the area outside of the pair during breeding season. These powerful hunters are relatively quiet birds.", "Africa", "south africa", "kruger national park", "sahara");
        Bird birdD = new Bird("Southern Ground Hornbill", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/220890091/1200",
                "black, red", 2, 2, "Bucorvus Leadbeateri", "The Southern ground hornbill is one of the two species of ground hornbill, which are both found solely within Africa; it is the largest species of hornbill worldwide. They live in groups of 5 to 10 individuals including adults and juveniles. These groups occupy and defend large territories against neighboring groups and often chase each other in aerial pursuits. Southern ground hornbills are active during the day and at night roost in trees. They forage on the ground, walking slowly searching for food.", "Africa", "south africa", "kruger national park", "savanna");
        Bird birdE = new Bird("Pel's Fishing Owl", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/219362491/1200",
                "brown", 2, 2, "Scotopelia Peli", "A giant, round-headed, ginger-rufous owl covered by dusky bards, spots, and chevrons. Quite shy; day-roosts are well-hidden in huge trees along permanent rivers and forested swamps with sluggish backwaters. The call is a deep, low, horn-like and also produces a series of grunts.", "Africa", "south africa", "kruger national park", "coastal");
        Bird birdF = new Bird( "Lesser Flamingo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/77964161/1200",
                "pink", 2, 2, "Phoeniconaias Minor", "The smallest flamingo in the world. Found in alkaline lakes and coastal lagoons, where gathers in huge flocks to eat microscopic blue-green algae. Breeds on remote flats sheltered from predators. Migrates and breeds in response to changing environmental conditions.", "Africa", "kenya", "rift valley", "tropical");
        Bird birdG = new Bird( "Red-Throated Bee-Eater", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/245593691/1200",
                "Green, Yellow, Red, Blue", 2, 2, "Merops Bulocki", "A pretty, medium-sized bee-eater with a red throat and a blue lower belly. Usually in small groups that perch conspicuously. The calls are simple trills, most of which have wooden quality.", "Africa", "kenya", "rift valley", "savannah");
        Bird birdH = new Bird("African Emerald Cuckoo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/184151961/1200",
                "Emerald Green", 2, 2, "Chrysococcyx Cupreus", "Small, slim, forest cuckoo. Found in moist forest, from sea level up to fairly high elevations. The do not build their own nest nor does it raise its young. The hen lays her eggs in the nests of other birds, specifically they use nests of Yellow-whiskered Bulbuls, Bee Eaters, Olive bush Shrikes or Puffback Shrikes. They invae the nest - either placing the eggs in the nest when the parents are foraging for food or forcing them off the nest while they are sitting in it. Once the hen is in the nest she will toss out any existing eggs and lay her own. The true occupants of the nest will come back to their nest and incubate the cuckoo egg(s) and raise as their own.", "Africa", "kenya", "rift valley", "woodlands");

        birdStorage.save(birdA);
        birdStorage.save(birdA);
        birdStorage.save(birdB);
        birdStorage.save(birdC);
        birdStorage.save(birdD);
        birdStorage.save(birdE);
        birdStorage.save(birdF);
        birdStorage.save(birdG);
        birdStorage.save(birdH);

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3975.00, "9 Days Africa Wildlife Photographic Private Safari Package", "Safari", "Kenya", "East", "plains", "/images/wildlifePhotographicSafari.jpg", "Explore the Tsavo West, Amboseli, Lake Nakuru and Masai Mara ecosystem the best African photo safari destinations, capture the best wildebeest migration experience, an encounter with big cats and large herds of Elephants and other animals. This 9 days Africa Wildlife Photographic Tour Safari offers a great opportunity to view and photograph Africa’s iconic animals – including Elephants, Lions, Cheetahs, Leopards and Giraffes – under expert guidance and tuition from our wildlife photographer guide. Also exciting is a cultural visit to one of the traditional villages and Mount Kilimanjaro breathtaking views. To maximize the amazing photographic opportunities, you simply need to be at the right place, in the right sport at the right time with the sun from just where you need it to be. This requires the services of a specialist guide and driver.");
        Destinations packageTwo = new Destinations(86.99, "Private Dolphin Tour and Snorkeling at Mnemba Island reef", "Snorkeling", "Tanzania", "East", "coastal", "/images/dolphinTourAndSnorkeling.jpg", "Combine three of Zanzibar’s must-do outdoor adventures into one half-day private tour without all the hassle of having to arrange anything for yourself. Head for the island’s north-eastern waters and watch for dolphins in their natural habitat before snorkeling at Mnemba Island Reef, where corals and clear waters teem with angel fish, rays and other tropical species. Finish at a sandbank to swim in the calm and bright shallows—the perfect finale.");

        destinationStorage.save(packageOne);
        destinationStorage.save(packageTwo);

        // Dummy Data - Tags: africa, safari, ocean, tropical, luxury
        Destinations kenya1 = new Destinations(1444.99, "Kamel Trekking In Kenya", "safari", "Kenya", "East", "plains", "/images/dest (1).jpg", "Explore Kenya with the best safari experience, ride a camel through the country's wilderness. You will encounter the heart of Kenya, the beautiful, exotic wilderness right in front of your eyes. ", africaTag, safariTag);
        Destinations kenya2 = new Destinations(1333.99, "Koastal Retreat", "luxury", "Kenya", "East", "tropical", "/images/dest (2).jpg", "Escape the ordinary and enjoy this perfect retreat and the undiscovered gems around Kenya. 2 days 1 night, free breakfast and all you can eat buffet.", tropicalTag, luxuryTag, africaTag);
        Destinations kenya3 = new Destinations(1222.99, "Kozy Kenya Kayaking", "romantic", "Kenya", "East", "coastal", "/images/dest (3).jpg", "Romantic retreat. Paradise... right in your finger tips. Perfect for couples who are ready to explore the beauty of Kenya. Explore the waters surrounding the beautiful Kenya. Perfect clear waters, brisk air and beautiful scenery.", oceanTag, africaTag);
        Destinations kenya4 = new Destinations(1111.99, "Kenya Kove", "luxury", "Kenya", "East", "coastal", "/images/dest (4).jpg", "Private beach and exotic food. The perfect combination for a perfect vacation! Enjoy the beautiful fine white sand and the crystal clear water. Meet our little friends and respect our marine wild life. 1 week stay, all included. All you can eat buffet and drinks. What happens in Kenya Kove... Stays in Kenya Kove.", africaTag, oceanTag, luxuryTag);

        Destinations mad1 = new Destinations(2555.99, "Madagascar Nascar", "safari", "Madagascar", "Island", "tropical", "/images/dest (5).jpg", "Learn the history of our plantations and our exotic fruits and vegetables. After this 5 hours safari, you will learn everything you need to know to start your own plantation and the history of Madagascar. This safari will take you in deep Madagascar and view wildlife right in front of your eyes. At the end, we will be receiving you with a buffet created with our produce! Enjoy this unique experience like you have never seen before.", africaTag, safariTag, tropicalTag);
        Destinations mad2 = new Destinations(2444.99, "Madagascar Madness", "boat", "Madagascar", "Island", "coastal", "/images/dest (6).jpg", "Enjoy your days on this beautiful, breezy, calm hotel. Escape your responsibilities for one week and enjoy the private beach and luxury hotel with breakfast and lunch included. You will be able to enjoy the marine wildlife and see our dolphin friends. On the third day of the week you will learn to snorkel with our expert instructor and see the beautiful marine wild life. After your 4 hours class you will return to your rooom, greeted with fresh and exotic fruits.", africaTag, oceanTag);
        Destinations mad3 = new Destinations(2333.99, "Madagascar & Caviar", "luxury", "Madagascar", "Island", "coastal", "/images/dest (7).jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eu nibh nec lacinia. Nam viverra, justo vel lacinia sagittis, neque neque facilisis diam, ullamcorper sollicitudin lacus nisl ut leo. Proin purus arcu, fermentum non vestibulum sit amet, rhoncus sit amet arcu. Nulla eu condimentum augue. Curabitur aliquet vulputate quam, non sodales tellus consequat eu. Praesent tempor justo at fringilla lacinia. Aenean viverra sollicitudin metus, congue blandit est iaculis sit amet. Aenean dictum semper velit, nec rutrum nunc consectetur in. Curabitur viverra tincidunt egestas. Nunc malesuada ultrices quam, ac commodo mauris sagittis vel. Nullam nibh turpis, finibus sed elit suscipit.", africaTag, luxuryTag, tropicalTag, oceanTag);
        Destinations mad4 = new Destinations(2222.99, "Madagascar Under The Stars", "romantic", "Madagascar", "Island", "mountain", "/images/dest (8).jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eu nibh nec lacinia. Nam viverra, justo vel lacinia sagittis, neque neque facilisis diam, ullamcorper sollicitudin lacus nisl ut leo. Proin purus arcu, fermentum non vestibulum sit amet, rhoncus sit amet arcu. Nulla eu condimentum augue. Curabitur aliquet vulputate quam, non sodales tellus consequat eu. Praesent tempor justo at fringilla lacinia. Aenean viverra sollicitudin metus, congue blandit est iaculis sit amet. Aenean dictum semper velit, nec rutrum nunc consectetur in. Curabitur viverra tincidunt egestas. Nunc malesuada ultrices quam, ac commodo mauris sagittis vel. Nullam nibh turpis, finibus sed elit suscipit.", africaTag);
        Destinations mad5 = new Destinations(2111.99, "Mornings in Madagascar", "boat", "Madagascar", "Island", "tropical", "/images/dest (9).jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eu nibh nec lacinia. Nam viverra, justo vel lacinia sagittis, neque neque facilisis diam, ullamcorper sollicitudin lacus nisl ut leo. Proin purus arcu, fermentum non vestibulum sit amet, rhoncus sit amet arcu. Nulla eu condimentum augue. Curabitur aliquet vulputate quam, non sodales tellus consequat eu. Praesent tempor justo at fringilla lacinia. Aenean viverra sollicitudin metus, congue blandit est iaculis sit amet. Aenean dictum semper velit, nec rutrum nunc consectetur in. Curabitur viverra tincidunt egestas. Nunc malesuada ultrices quam, ac commodo mauris sagittis vel. Nullam nibh turpis, finibus sed elit suscipit.", africaTag, tropicalTag, oceanTag);

        Destinations alge1 = new Destinations(3333.99, "Algeria Pizzaria", "romantic", "Algeria", "North", "mountain", "/images/dest (10).jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eu nibh nec lacinia. Nam viverra, justo vel lacinia sagittis, neque neque facilisis diam, ullamcorper sollicitudin lacus nisl ut leo. Proin purus arcu, fermentum non vestibulum sit amet, rhoncus sit amet arcu. Nulla eu condimentum augue. Curabitur aliquet vulputate quam, non sodales tellus consequat eu. Praesent tempor justo at fringilla lacinia. Aenean viverra sollicitudin metus, congue blandit est iaculis sit amet. Aenean dictum semper velit, nec rutrum nunc consectetur in. Curabitur viverra tincidunt egestas. Nunc malesuada ultrices quam, ac commodo mauris sagittis vel. Nullam nibh turpis, finibus sed elit suscipit.", africaTag);
        Destinations alge2 = new Destinations(3222.99, "Alpines of Algeria", "safari", "Algeria", "North", "mountain", "/images/dest (11).jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eu nibh nec lacinia. Nam viverra, justo vel lacinia sagittis, neque neque facilisis diam, ullamcorper sollicitudin lacus nisl ut leo. Proin purus arcu, fermentum non vestibulum sit amet, rhoncus sit amet arcu. Nulla eu condimentum augue. Curabitur aliquet vulputate quam, non sodales tellus consequat eu. Praesent tempor justo at fringilla lacinia. Aenean viverra sollicitudin metus, congue blandit est iaculis sit amet. Aenean dictum semper velit, nec rutrum nunc consectetur in. Curabitur viverra tincidunt egestas. Nunc malesuada ultrices quam, ac commodo mauris sagittis vel. Nullam nibh turpis, finibus sed elit suscipit.", safariTag, africaTag);
        Destinations alge3 = new Destinations(3111.99, "Algerian Mysteries", "safari", "Algeria", "North", "desert", "/images/dest (12).jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sodales eu nibh nec lacinia. Nam viverra, justo vel lacinia sagittis, neque neque facilisis diam, ullamcorper sollicitudin lacus nisl ut leo. Proin purus arcu, fermentum non vestibulum sit amet, rhoncus sit amet arcu. Nulla eu condimentum augue. Curabitur aliquet vulputate quam, non sodales tellus consequat eu. Praesent tempor justo at fringilla lacinia. Aenean viverra sollicitudin metus, congue blandit est iaculis sit amet. Aenean dictum semper velit, nec rutrum nunc consectetur in. Curabitur viverra tincidunt egestas. Nunc malesuada ultrices quam, ac commodo mauris sagittis vel. Nullam nibh turpis, finibus sed elit suscipit.", safariTag, africaTag);

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

        BirdWatchers watchersA = new BirdWatchers("Ornithologist", "Ornithologist is a name for bird watcher who studies different avian species for professional purposes. This person may or may not have a PhD in biology, but bachelor or master degrees are often a must. Ornithologists are paid to watch birds in order to gather new information about avians.");
        BirdWatchers watchersB = new BirdWatchers("Bird Watchers", "Bird watchers are people who consider birdwatching a hobby, and nothing more. They are amateurs who belong to the beginner level, and their knowledge about birds is just enough to satisfy their hobby.");
        BirdWatchers watchersC = new BirdWatchers("Twitchers", "Bird watchers are called many names, and one of those is twitchers. These hobbyists are willing to spend money on adventures to different places to watch birds in their natural habitats.");
        BirdWatchers watchersD = new BirdWatchers("Birders", "Birder is another bird watching term for people who love watching avians. Birders are committed to their hobby, enough to purchase a couple of tools for birdwatching.");
        BirdWatchers watchersE = new BirdWatchers("Listers", "Another bird watching name is lister. This person makes an extensive list of birds as they perform birdwatching. Listers are known to be obsessed with their list of avians, and they do whatever it takes to constantly update their lifelist.");
        BirdWatchers watchersF = new BirdWatchers("Dude", "A dude is a casual bird watcher who likes watching birds, but it is not a priority for them. They watch avians when the weather is good, and they rarely go to distant spots.");
        BirdWatchers watchersG = new BirdWatchers("Protobirder", "A protobirder is a new term for a person who enjoys birdwatching. Protobirders claim to be super knowledgeable about birds, although whether that’s the case is debatable. This term may be new, but it is starting to be used more often in the birdwatching communities from all over the world.");

        birdWatchersStorage.save(watchersA);
        birdWatchersStorage.save(watchersB);
        birdWatchersStorage.save(watchersC);
        birdWatchersStorage.save(watchersD);
        birdWatchersStorage.save(watchersE);
        birdWatchersStorage.save(watchersF);
        birdWatchersStorage.save(watchersG);
    }
}
