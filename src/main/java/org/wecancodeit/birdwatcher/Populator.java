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

    @Resource
    private BookingRepository bookingStorage;

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

        // public Destinations(Double packagePrice, String packageName, String packageCategory, String country, String region, String habitat, String destinationImageUrl, String packageDesc)
        Destinations packageOne = new Destinations(3975.00, "9 Days Africa Wildlife Photographic Private Safari Package", "Safari", "Kenya", "East", "plains", "/images/wildlifePhotographicSafari.jpg", "Explore the Tsavo West, Amboseli, Lake Nakuru and Masai Mara ecosystem the best African photo safari destinations, capture the best wildebeest migration experience, an encounter with big cats and large herds of Elephants and other animals. This 9 days Africa Wildlife Photographic Tour Safari offers a great opportunity to view and photograph Africa’s iconic animals – including Elephants, Lions, Cheetahs, Leopards and Giraffes – under expert guidance and tuition from our wildlife photographer guide. Also exciting is a cultural visit to one of the traditional villages and Mount Kilimanjaro breathtaking views. To maximize the amazing photographic opportunities, you simply need to be at the right place, in the right sport at the right time with the sun from just where you need it to be. This requires the services of a specialist guide and driver.");
        Destinations packageTwo = new Destinations(86.99, "Private Dolphin Tour and Snorkeling at Mnemba Island reef", "Snorkeling", "Gabon", "West", "coastal", "/images/dolphinTourAndSnorkeling.jpg", "Combine three of Zanzibar’s must-do outdoor adventures into one half-day private tour without all the hassle of having to arrange anything for yourself. Head for the island’s north-eastern waters and watch for dolphins in their natural habitat before snorkeling at Mnemba Island Reef, where corals and clear waters teem with angel fish, rays and other tropical species. Finish at a sandbank to swim in the calm and bright shallows—the perfect finale.");

        destinationStorage.save(packageOne);
        destinationStorage.save(packageTwo);

        // Dummy Data - Tags: africa, safari, ocean, tropical, luxury
        Destinations kenya1 = new Destinations(1444.99, "Kamel Trekking In Kenya", "safari", "Kenya", "East", "plains", "/images/dest (1).jpg", "Explore Kenya with the best safari experience, ride a camel through the country's wilderness. You will encounter the heart of Kenya, the beautiful, exotic wilderness right in front of your eyes. ", africaTag, safariTag);
        Destinations kenya2 = new Destinations(1333.99, "Koastal Retreat", "luxury", "Kenya", "East", "tropical", "/images/dest (2).jpg", "Escape the ordinary and enjoy this perfect retreat and the undiscovered gems around Kenya. 2 days 1 night, free breakfast and all you can eat buffet.", tropicalTag, luxuryTag, africaTag);
        Destinations kenya3 = new Destinations(1222.99, "Kozy Kenya Kayaking", "romantic", "Kenya", "East", "coastal", "/images/dest (3).jpg", "Romantic retreat. Paradise... right in your finger tips. Perfect for couples who are ready to explore the beauty of Kenya. Explore the waters surrounding the beautiful Kenya. Perfect clear waters, brisk air and beautiful scenery.", oceanTag, africaTag);
        Destinations kenya4 = new Destinations(1111.99, "Kenya Kove", "luxury", "Kenya", "East", "coastal", "/images/dest (4).jpg", "Private beach and exotic food. The perfect combination for a perfect vacation! Enjoy the beautiful fine white sand and the crystal clear water. Meet our little friends and respect our marine wild life. 1 week stay, all included. All you can eat buffet and drinks. What happens in Kenya Kove... Stays in Kenya Kove.", africaTag, oceanTag, luxuryTag);

        Destinations mad1 = new Destinations(2555.99, "Madagascar Nascar", "safari", "Madagascar", "Island", "tropical", "/images/dest (5).jpg", "Learn the history of our plantations and our exotic fruits and vegetables. After this 5 hours safari, you will learn everything you need to know to start your own plantation and the history of Madagascar. This safari will take you in deep Madagascar and view wildlife right in front of your eyes. At the end, we will be receiving you with a buffet created with our produce! Enjoy this unique experience like you have never seen before.", africaTag, safariTag, tropicalTag);
        Destinations mad2 = new Destinations(2444.99, "Madagascar Madness", "boat", "Madagascar", "Island", "coastal", "/images/dest (6).jpg", "Enjoy your days on this beautiful, breezy, calm hotel. Escape your responsibilities for one week and enjoy the private beach and luxury hotel with breakfast and lunch included. You will be able to enjoy the marine wildlife and see our dolphin friends. On the third day of the week you will learn to snorkel with our expert instructor and see the beautiful marine wild life. After your 4 hours class you will return to your rooom, greeted with fresh and exotic fruits.", africaTag, oceanTag);
        Destinations mad3 = new Destinations(2333.99, "Madagascar & Caviar", "luxury", "Madagascar", "Island", "coastal", "/images/dest (7).jpg", "Private Luxury Hotel with your own beach! This is the ultimate vacation package, you will be greeted with our friendly staff and a madagascar sour drink. The rest of the five days you will be attending cooking classes and yoga classes for the ultimate experience. For the five days of stay, you will be given a lunch and dinner selection from our top chefs. It is time to enjoy life in the best way and what better than on our Heaven Resort.", africaTag, luxuryTag, tropicalTag, oceanTag);
        Destinations mad4 = new Destinations(2222.99, "Madagascar Under The Stars", "romantic", "Madagascar", "Island", "mountain", "/images/dest (8).jpg", "What better than to have dinner with your favorite person under the stars? The finest entrees you will ever taste! Created by the finest chefs on the area. You will be greeted with a glass of wine and assigned a table with the best view of the stars. After you had the best food you have ever tried, we will take you to Tsiafajavona Mountain, where you will be making a wish and letting go a floating lantern. This is the most romantic date you and your partner will ever be on. Enjoy life now!", africaTag);
        Destinations mad5 = new Destinations(2111.99, "Mornings in Madagascar", "boat", "Madagascar", "Island", "tropical", "/images/dest (9).jpg", "The most beautiful sunrise your eyes have ever seen. Every person who has been in this boat desires to stay and live here forever. From the beautiful crystal clear waters to the comfiest bed, this will be yours for 3 days! Every morning you will be greeted with an assortment of fresh fruits and breakfast, starting the day on the best way. On your second day, you are going to receive a 2 hours training on how to swim with sharks. Afterwards you are going to swim with sharks! Be ready to have the best experience of your life.", africaTag, tropicalTag, oceanTag);

        Destinations alge1 = new Destinations(3333.99, "Algeria Pizzaria", "romantic", "Gabon", "West", "mountain", "/images/dest (10).jpg", "The best pizza in the whole world with the best view! We make this pizza with fresh ingredients straight from our plantation. Indulge yourself on the fresh mozzarella and pasta sauce while watching the sunset and listening to live music. The beautiful calm waters, the colorful sunset, the aromatic scent of the area, this is one of the best experiences you will have! ", africaTag);
        Destinations alge2 = new Destinations(3222.99, "Alpines of Algeria", "safari", "Gabon", "West", "mountain", "/images/dest (11).jpg", "Meet our bird friends on this calm safari, from our owls to our small birds, you will be able to see them in live action. Currently, we have 2 owlets that were born a month ago. We are keeping a close eye to them and making sure they are doing alright. On this 2 hours safari we will take you on a road not seen before, where you will see all types of wildlife. You will be on the safe hands of our expert driver. After this fulfilling event you will be greeted with a cocktail made from our finest bartenders.", safariTag, africaTag);
        Destinations alge3 = new Destinations(3111.99, "Algerian Mysteries", "safari", "Gabon", "West", "desert", "/images/dest (12).jpg", "Learn the history of the pyramid while on Algerian Mysteries Safari. After this 3 hours safari, you will know the ins and outs of this pyramid. A very unique experience, where you get to go to the tunnels and all the secret passageways. ", safariTag, africaTag);

        Destinations gin1 = new Destinations(4333.99, "Grapevies and Guinea", "romantic", "Guinea", "West", "coastal", "/images/dest (1).jpg", "Enjoy wining, dining and lodging at its finest with our two night Grapevines & Guinea Package. This package includes two night accommodations, Wine shuttle on one day for two people to local wineries, 1 wine tasting at a local winery, wine tasting and bird watching for two, breakfast for two each morning.", africaTag);
        Destinations gin2 = new Destinations(4222.99, "Great Games in Guinea", "safari", "Guinea", "West", "mountain", "/images/dest (2).jpg", "The Upper Guinea rainforest attracts most birders to Ghana, and we’ll visit six different forest sites: Kakum National Park, home to Africa’s only canopy walkway, places us at eye -level with a wonderful array of rainforest species and provides a marvelous introduction to West Africa’s forests; Nsuta swamp forest is little visited by birders, but quite a few Upper Guinea rarities have been found here; Ankasa forest reserve, where we’ll spend three nights camping, gives us a chance at deep-forest waterbirds including the Hartlaub’s Duck and White-crested Tiger Heron.", safariTag, africaTag);
        Destinations gin3 = new Destinations(4111.99, "Guinea Galore", "boat", "Guinea", "West", "desert", "/images/dest (3).jpg", "South Africa has long been considered a prime birding destination and our Eastern South Africa tour offers an incredible experience of one of Africa’s most ecologically diverse countries. Our route will draw us from sea level at the Indian Ocean coast to above 9400 along Sani Pass in the Drakensberg escarpment, a route which will provide us with a sampling of a host of habitat types and bird communities.", safariTag, africaTag);

        Destinations south1 = new Destinations(4333.99, "South Africa and Sun", "romantic", "South", "South", "coastal", "/images/dest (4).jpg", "Take an early morning flight Upington. Having collected our vehicle we’ll begin our drive north toward the Kalahari. We’ll have not gone far before we see the first of many massive Sociable Weaver nests perched atop roadside poles. Other species that could break our journey include White-backed Vulture, Southern Pale Chanting Goshawk, Pygmy Falcon, Southern Ant-eating Chat, Fawn-coloured Lark, and possibly Short-toed Rock Thrush. Night near Kgalagadi Reserve.", africaTag);
        Destinations south2 = new Destinations(4222.99, "Southern Hospitality", "safari", "South", "South", "mountain", "/images/dest (5).jpg", "Sandwiched between Namibia and Botswana, the Kgalagadi Trans Frontier Reserve is one of Africa’s wildest and least-known national parks. We’ll have a short journey to get to the reserve gate when it opens for the day. Once inside we’ll head for a small waterhole, where we should be treated to flocks of Namaqua Sandgrouse coming to drink, hopefully joined by good numbers of Burchell’s Sandgrouse and hordes of other birds such as Namaqua Doves, Cape Sparrows, Red-headed Finches, and of course those ubiquitous Sociable Weavers. We are allowed out of our vehicle in only a few designated places, so we’ll spend the morning slowly driving along a road that follow an old riverbed, using the vehicle almost as a mobile blind.", safariTag, africaTag);
        Destinations south3 = new Destinations(4111.99, "Sandy Southern Shores", "boat", "South", "South", "desert", "/images/dest (6).jpg", "You'd be mad to go to Africa and not embark on a safari. The continent is home to some of the world's most majestic creatures, from graceful giraffes to proud lions and lumbering elephants. But safaris can be hard work. So what better way to compliment your wildlife adventure than with a few days of R&R on the beach? From the white sands of Zanzibar to the windswept beaches of Swakopmund in Namibia and the southern point of Africa at Cape Town, there are loads of great options for creating your perfect beach and wildlife journey.", safariTag, africaTag);

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

        destinationStorage.save(gin1);
        destinationStorage.save(gin2);
        destinationStorage.save(gin3);

        destinationStorage.save(south1);
        destinationStorage.save(south2);
        destinationStorage.save(south3);

        // public Bird(long id, String nameOfBird, String birdImageUrl, String colorOfBird, double lengthOfBeak, double lengthOfWing, String species, String description, String continent, String country, String countryRegion, String habitat)
        Bird birdA = new Bird("Saddle-Billed Stork", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/220922121/1200",
                "black & white", 10.7, 8.6, "Ephippiorhynchus Senegalensis", "This is a huge bird that regularly attains a height of 145 to 150 cm, a length of 142 cm and 2.4 to 2.7 m wingspan. The head, neck, back, wings, and tail are iridescent black, with the rest of the body and the primary flight feather being white. The massive bill is red with a black band and a yellow frontal shield. The legs and feet are black with pink hocks. On the chest is a bare red patch of skin, whose colour darkens during the breeding season.",
                "Africa", "kenya", "east africa", "savanna", "ciconiiformes", kenya1, kenya2, kenya3, kenya4);

        Bird birdB = new Bird("Kori Bustard", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/218717931/1200",
                "brown", 3.6, 8.1, "Ardeotis Kori", "They are the world's heaviest flying birds. These birds are omnivorous, although they tend to be more carnivorous than other species of bustards. Insects form a large portion of their diet, especially when they are chicks. They also eat a variety of small mammals, lizards, snakes, seeds and berries. During the height of the mating display, the male inflates his esophagus to as much as four times its normal size. The tail feathers are cocked to reveal as much of the white under feathers as possible. The wings may droop down so much that the tips of the primaries touch the ground. During direct courtship of a female, the male will bow toward her with his neck inflated and bill snapping. He may also emit a low pitched booming sound.",
                "Africa", "south africa", "south africa", "coastal", "otidiformes", south1, south2, south3);
        Bird birdBA = new Bird("Arabian Bustard", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/244545511/1200",
                "tan", 3.4, 8.4, "Ardeotis Arabs", "A large, long-necked bustard with a small crest at the back of the head and white spots on the wing coverts. The sexes have similar plumage, but females are smaller and slimmer. Found in dry savanna, grassland, and desert, usually in pairs or loose groups. Similar to Kori Bustard, but smaller and slimmer, and lacks black at the base of the neck and along the front of the wing. Similar in size to Dehnam’s Bustard, but lacks rufous on the back of the neck. Not very vocal, but will give a low-pitched growling note when displaying or when flushed.",
                "Africa", "kenya", "east africa", "sahara", "otidiformes", kenya1, kenya2, kenya3, kenya4);

        Bird birdC = new Bird("Martial Eagle", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/218877601/1200",
                "brown", 1.9, 6.8, "Polemaetus Bellicosus", "Martial eagles are diurnal, often spending a large portion of the day on the wing, and often at a great height. When not breeding, both mature eagles from a breeding pair may be found roosting on their own in some tree up to several miles from their nesting haunt, probably hunting for several days in one area, and then moving on to another area. Martial eagles usually hunt in a long, shallow stoop, however, when the quarry is seen in a more enclosed space, they parachute down to a relatively steeper angle. These type of birds tend to be solitary and do not tolerate other eagles in the area outside of the pair during breeding season. These powerful hunters are relatively quiet birds.",
                "Africa", "south africa", "south africa", "savanna", "accipitriformes", south1, south2, south3);

        Bird birdD = new Bird("Southern Ground Hornbill", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/220890091/1200",
                "black & red", 7.1, 6.1, "Bucorvus Leadbeateri", "The Southern ground hornbill is one of the two species of ground hornbill, which are both found solely within Africa; it is the largest species of hornbill worldwide. They live in groups of 5 to 10 individuals including adults and juveniles. These groups occupy and defend large territories against neighboring groups and often chase each other in aerial pursuits. Southern ground hornbills are active during the day and at night roost in trees. They forage on the ground, walking slowly searching for food.",
                "Africa", "kenya", "east africa", "savanna", "bucerotiformes", kenya1, kenya2, kenya3, kenya4);
        Bird birdDA = new Bird("Abyssinian Ground-Hornbill", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/245260391/1200",
                "black & red", 6.8, 6.3, "Bucorvus Abyssinicus", "A huge ground-dwelling hornbill. Males have a mix of blue and red bare facial skin, while females have entirely blue facial skin. In flight, a large white patch is revealed in the wings. Found in savanna, grassland, and agricultural habitats, usually in pairs or small groups, walking on the ground. Breeds and roosts in trees. Similar to Southern Ground-Hornbill, but there is little overlap in range, and Abyssinian is easily separated by the blue facial skin. The call is a series of deep boop notes.",
                "Africa", "kenya", "east africa", "savanna", "bucerotiformes", kenya1, kenya2, kenya3, kenya4);
        Bird birdDB = new Bird("Abyssinian Scimitarbill", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/245257771/1200",
                "black & indigo", 5.1, 1.3, "Rhinopomastus Minor", "This all-black bird has a curved orange bill and a fairly long tail. Northern birds have white bars across the wings, which are conspicuous in flight, while southern birds have entirely black wings. Found in dry savanna and thornscrub. Separated from other scimitarbills by its orange bill. Similar to some woodhoopoes, but separated by its smaller size, shorter all-black tail, and black legs. Vocalizations include a series of wavering, rising notes and an agitated-sounding series of dok notes.",
                "Africa", "kenya", "east africa", "savanna", "bucerotiformes", kenya1, kenya2, kenya3, kenya4);

        Bird birdE = new Bird("Pel's Fishing Owl", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/219362491/1200",
                "brown", 1.7, 5.2, "Scotopelia Peli", "A giant, round-headed, ginger-rufous owl covered by dusky bards, spots, and chevrons. Quite shy; day-roosts are well-hidden in huge trees along permanent rivers and forested swamps with sluggish backwaters. The call is a deep, low, horn-like and also produces a series of grunts.",
                "Africa", "gabon", "west africa", "coastal", "strigiformes", alge1, alge2, alge3);
        Bird birdEA = new Bird("Rufous Fishing-Owl", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/364507691/1200",
                "tawny", 1.8, 4.8, "Scotopelia Ussheri", "A round-headed, tawny-cinnamon fishing-owl with lightly streaked underparts and a dark beak with a yellow base. It is shy, and its day roosts are well hidden in tangles and thickets along rivers in lowland primary, swamp, and flooded forests. The call is a low dove-like ooooo that can be confused with the call of the nocturnal White-crested Tiger-Heron. The similar Pel’s Fishing-Owl is larger and rustier, especially on the underparts, and is covered in spots, bars, and chevrons, not streaks. Vermiculated Fishing-Owl has an entirely yellow bill and its underparts are more heavily streaked.",
                "Africa", "guinea", "west africa", "coastal", "strigiformes", gin1, gin2, gin3);
        Bird birdEB = new Bird("Vermiculated Fishing-Owl", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/254494311/1200",
                "orange", 1.5, 5.0, "Scotopelia Bouvieri", "A round-headed, gingery fishing-owl with heavily streaked underparts and a yellow beak. It is shy and day-roosts are well hidden in huge trees along rivers in lowland primary, swamp and flooded forests. The call is a deep low horn-like hooooo, and young birds sometimes emit an eerie screeching wheeeuuu. Similar Pel’s Fishing-Owl is larger and rustier (especially on the underparts) than Vermiculated Fishing-Owl, has a black (not yellow) beak, and is covered in spots, bars and chevrons.",
                "Africa", "gabon", "west africa", "coastal", "strigiformes", alge1, alge2, alge3);

        Bird birdF = new Bird( "Lesser Flamingo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/54167691/1200",
                "pink", 6.5, 3.2, "Phoeniconaias Minor", "The smallest flamingo in the world. Found in alkaline lakes and coastal lagoons, where gathers in huge flocks to eat microscopic blue-green algae. Breeds on remote flats sheltered from predators. Migrates and breeds in response to changing environmental conditions.",
                "Africa", "madagascar", "island", "tropical", "phoenicopteriformes", mad1, mad2, mad3, mad4, mad5);
        Bird birdFA = new Bird( "Greater Flamingo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/77964161/1200",
                "white & pink", 6.1, 5.2, "Phoenicopterus Roseus", "Distributed from Africa and southern Europe through West Asia to South Asia. Very large, with long, coat hanger neck, big kinked bill, and very long pinkish legs. Plumage at rest whitish with pale pink blush and some deep pink often visible on closed wings. Flies with long neck and legs extended, when deep pink-and-black wing pattern striking.",
                "Africa", "madagascar", "island", "tropical", "phoenicopteriformes", mad1, mad2, mad3, mad4, mad5);

        Bird birdG = new Bird( "Red-Throated Bee-Eater", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/245593691/1200",
                "Green, Yellow, Red, Blue", 1.2, 1.5, "Merops Bulocki", "A pretty, medium-sized bee-eater with a red throat and a blue lower belly. Usually in small groups that perch conspicuously. The calls are simple trills, most of which have wooden quality.",
                "Africa", "guinea", "west africa", "sahara", "coraciiformes", gin1, gin2, gin3);
        Bird birdGA = new Bird( "Blue-headed Bee-Eater", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/250961761/1200",
                "Blue", 1.1, 1.7, "Merops Muelleri", "An easily overlooked forest bee-eater found in Central Africa and locally in East Africa, occurring in the forest interior and near forest edge and tree-fall gaps. Dark overall with a bluish to blue-purple head, belly, and tail, a red throat, a dark purplish-black face, a pale azure forehead, and a reddish back. May overlap locally with Blue-moustached Bee-eater in South-West Region, Cameroon, but Blue-headed Bee-eater has a pale forehead and no noticeable eye-line. Calls include a seldom-heard, two-parted ji-up!",
                "Africa", "gabon", "west africa", "coastal", "coraciiformes", alge1, alge2, alge3);
        Bird birdGB = new Bird( "Black Bee-Eater", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/250959771/1200",
                "Black", 1.3, 1.8, "Merops Gularis", "A bee-eater of forest and forest edge that appears entirely black at a distance, but in good light shows a bright red throat and electric blue belly, undertail, and chest spots. Western birds have a black eye-line bordered in blue. Unmistakable when seen well. Call is a sharp ji-lip! that is not often heard.",
                "Africa", "guinea", "west africa", "coastal", "coraciiformes", gin1, gin2, gin3);

        Bird birdH = new Bird("African Emerald Cuckoo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/184151961/1200",
                "Emerald Green", 0.6, 2.4, "Chrysococcyx Cupreus", "Small, slim, forest cuckoo. Found in moist forest, from sea level up to fairly high elevations. The do not build their own nest nor does it raise its young. The hen lays her eggs in the nests of other birds, specifically they use nests of Yellow-whiskered Bulbuls, Bee Eaters, Olive bush Shrikes or Puffback Shrikes. They invae the nest - either placing the eggs in the nest when the parents are foraging for food or forcing them off the nest while they are sitting in it. Once the hen is in the nest she will toss out any existing eggs and lay her own. The true occupants of the nest will come back to their nest and incubate the cuckoo egg(s) and raise as their own.",
                "Africa", "south africa", "south africa", "coastal", "cuculiformes", south1, south2, south3);
        Bird birdHA = new Bird("Yellow-Throated Cuckoo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/333421721/1200",
                "Brown & Yellow", 1.1, 2.3, "Chrysococcyx Flavigularis", "A small green-backed forest cuckoo of West and Central Africa. Males have a distinctive bright yellow throat and a brown-and-black barred belly, while females lack the yellow throat and have a brown-and-black barred face, throat, and breast. Can be located by its distinctive song, which is a series of up to 10 or more rapidly delivered clear whistles that speed up before quickly fading. Alternate call is an often overlooked dwuit-tew or wait here. Usually outnumbered by African Emerald Cuckoo, in which males have yellow bellies and green heads and females have more of a black-and-white barred appearance.",
                "Africa", "guinea", "west africa", "coastal", "cuculiformes", gin1, gin2, gin3);
        Bird birdHB = new Bird("Dideric Cuckoo", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/221456681/1200",
                "Brown & Yellow", 1.1, 2.3, "Chrysococcyx Caprius", "A small, greenish cuckoo. The male has barred flanks, white flecking on the wing, white patches in front of and behind the eye, and a distinctly red eye surrounded by a red eye-ring. The bronzy-green female has a diagnostic white patch in front of the eye, a plain back, and white patches in the wings. This common resident and migrant is not a habitat specialist, but it prefers riverine and wetland areas where its preferred brood-parasite hosts, weavers and bishops, are common. The distinctive call is a loud, rising, high-pitched deee-deee-deee-deee-dederik.",
                "Africa", "south africa", "south africa", "coastal", "cuculiformes", south1, south2, south3);

        Bird birdI = new Bird("Madagascar Pochard", "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/191687411/1200",
                "Brown", 1.1, 2.3, "Aythya Innotata", "Extremely rare diving duck that was long thought extinct before being rediscovered in 2006 in a remote site in northern Madagascar. A large duck that is mostly rich brown, with white under the tail. Shows a conspicuous white wing stripe in flight. Males have a pale eye and females a dark one. Lives on freshwater lakes and wetlands. Dives frequently, like a grebe, but is much larger. Lacks the pale face of White-faced Whistling-Duck. Smaller than Meller’s Duck, with darker brown coloration and white under the tail.",
                "Africa", "madagascar", "island", "tropical", "anseriformes", mad1, mad2, mad3, mad4, mad5);

        birdStorage.save(birdA);
        birdStorage.save(birdA);
        birdStorage.save(birdB);
        birdStorage.save(birdC);
        birdStorage.save(birdD);
        birdStorage.save(birdE);
        birdStorage.save(birdF);
        birdStorage.save(birdG);
        birdStorage.save(birdH);
        birdStorage.save(birdI);

        birdStorage.save(birdBA);
        birdStorage.save(birdDA);
        birdStorage.save(birdDB);
        birdStorage.save(birdEA);
        birdStorage.save(birdEB);
        birdStorage.save(birdFA);
        birdStorage.save(birdGA);
        birdStorage.save(birdGB);
        birdStorage.save(birdHA);
        birdStorage.save(birdHB);

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

        Booking booking1 = new Booking("bob", "bob@gmail.com", "1231234", kenya1, "jan 21", "jan 30");

        bookingStorage.save(booking1);
    }
}
