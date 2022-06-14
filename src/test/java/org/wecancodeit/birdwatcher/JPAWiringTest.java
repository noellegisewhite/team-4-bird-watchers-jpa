package org.wecancodeit.birdwatcher;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.wecancodeit.birdwatcher.destination.Destinations;
import org.wecancodeit.birdwatcher.hashtag.Hashtag;
import org.wecancodeit.birdwatcher.destination.DestinationsRepository;
import org.wecancodeit.birdwatcher.hashtag.HashtagRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DestinationsRepository destStorage;

    @Autowired
    private HashtagRepository hashStorage;

    // Variables
    private Hashtag testTag1 = new Hashtag("beach");
    private Hashtag testTag2 = new Hashtag("jungle");
    private Destinations testDest1 = new Destinations("Sunset Seagull Soiree", testTag1);
    private Destinations testDest2 = new Destinations("Beachfront Bird Bash", testTag1, testTag2);


    @Test // Fails when running all tests, passes when ran by itself
    public void testTag1IdWillReturnAs1() {
        hashStorage.save(testTag1);

        entityManager.flush();
        entityManager.clear();

        Hashtag foundTag = hashStorage.findById(testTag1.getId()).get();
        assertThat(foundTag.getId(), is(1L));
    }

    @Test
    public void destinationsWillReturnAListOfOneHashtag() {
        hashStorage.save(testTag1);
        destStorage.save(testDest1);

        entityManager.flush();
        entityManager.clear();

        Hashtag foundTag = hashStorage.findById(testTag1.getId()).get();
        Destinations foundDest = destStorage.findById(testDest1.getId()).get();
        assertThat(foundDest.getHashtags(), containsInAnyOrder(foundTag));
    }

    @Test
    public void willReturnTwoTagsInHashtagRepo() {
        hashStorage.save(testTag1);
        hashStorage.save(testTag2);

        entityManager.flush();
        entityManager.clear();

        long hashSize = hashStorage.count();
        assertEquals(2, hashSize);
    }

    @Test
    public void willReturnOneTagInTest1DestCollectionOfTags() {
        hashStorage.save(testTag1);
        hashStorage.save(testTag2);
        destStorage.save(testDest1);

        entityManager.flush();
        entityManager.clear();

        int hashSize = testDest1.getHashtags().size();
        assertEquals(1, hashSize);
    }

    @Test
    public void willReturnTwoTagsInTestDest2CollectionOfTags() {
        hashStorage.save(testTag1);
        hashStorage.save(testTag2);
        destStorage.save(testDest1);

        entityManager.flush();
        entityManager.clear();

        int hashSize = testDest2.getHashtags().size();
        assertEquals(2, hashSize);
    }

//    @Test // Need help getting this to pass. Will work on tomorrow.
//    public void willAddTestTag2ToTestDest1ListOfHashtags() {
//        hashStorage.save(testTag1);
//        hashStorage.save(testTag2);
//        destStorage.save(testDest1);
//
//        Destinations newDest = destStorage.findById(testDest1.getId()).get();
//        // testDest1.addOneHashtag(testTag2);
//        destStorage.save(newDest);
//
//        entityManager.flush();
//        entityManager.clear();
//
//        int hashSize = newDest.getHashtags().size();
//        assertEquals(1, hashSize);
//    }
}
