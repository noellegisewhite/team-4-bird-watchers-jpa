package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Bird;

import java.util.List;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    List<Bird> findById(long id);
    List<Bird> findBySpecies(String species);
    List<Bird> findByCountry(String country);
    List<Bird> findByCountryRegion(String countryRegion);
    List<Bird> findByHabitat(String habitat);
}
