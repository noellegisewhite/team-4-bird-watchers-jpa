package org.wecancodeit.birdwatcher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    List<Bird> findById(long id);
    List<Bird> findBySpecies(String species);
    List<Bird> findByCountry(String country);
    List<Bird> findByRegion(String region);
    List<Bird> findByHabitat(String habitat);
}
