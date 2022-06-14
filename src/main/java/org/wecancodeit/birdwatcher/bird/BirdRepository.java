package org.wecancodeit.birdwatcher.bird;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class BirdRepository{

    HashMap<Long, Bird> birdList = new HashMap<>();

    Bird birdA = new Bird(1L, "Saddle-billed stork", "https://th.bing.com/th?q=Saddle-billed+Stork+Female&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 3, "Ephippiorhynchus senegalensis", "bird", "Africa",
            "South Africa", "Kruger National Park", "Sub-Saharan Africa");
    Bird birdB = new Bird(2L, "Kori Bustard", "https://th.bing.com/th?q=Kori+Bustard+Bird+Wingspan&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 2, "Ardeotis kori", "bird", "Africa", "South Africa", "Kruger National Park", "grasslands");
    Bird birdC = new Bird(3L, "Martial Eagle", "https://th.bing.com/th?q=Martial+Eagle+Wings&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 2, "Polemaetus bellicosus", "bird", "Africa", "South Africa", "Kruger National Park", "Sub-Saharan Africa");
    Bird birdD = new Bird(4L, "Southern Ground Hornbill", "https://th.bing.com/th?q=Southern+Ground+Hornbill+Baby&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 2, "Bucorvus leadbeateri", "bird", "Africa", "South Africa", "Kruger National Park", "Savanna");
    Bird birdE = new Bird(5L, "Pel's Fishing Owl", "https://th.bing.com/th?q=Painting+of+a+Pels+Fishing+Owl&dc=2&w=100&h=100&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 2, "Scotopelia peli", "bird", "Africa", "South Africa", "Kruger National Park", "Rivers and Lakes");
    Bird birdF = new Bird(6L, "Flamingo", "https://th.bing.com/th?q=Flamingo+Fun&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "pink", 2, 2, "Phoeniconaias minor", "bird", "Africa", "Kenya", "Rift Valley", "Soda Lakes");
    Bird birdG = new Bird(7L, "Red-throated bee-eater", "https://th.bing.com/th?q=Red-necked+Bee-eater&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 2, "Merops bulocki", "bird", "Africa", "Kenya", "Rift Valley", "Savannah");
    Bird birdH = new Bird(8L, "African emeral cuckoo", "https://th.bing.com/th?q=African+Emerald+Cuckoo+Feeding&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.25&pid=InlineBlock&mkt=en-US&cc=US&setlang=en&adlt=moderate&t=1&mw=247", "black", 2, 2, "Chrysococcyx cupreus", "bird", "Africa", "Kenya", "Rift Valley", "Woodlands");
    

}
//public interface BirdRepository extends CrudRepository<Bird, Long> {
//
//    List<Bird> findById(long id);
//    List<Bird> findBySpecies(String species);
//    List<Bird> findByCountry(String country);
//    List<Bird> findByCountryRegion(String countryRegion);
//    List<Bird> findByHabitat(String habitat);
//}
