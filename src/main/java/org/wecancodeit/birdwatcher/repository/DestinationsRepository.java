package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Destinations;

import java.util.List;

@Repository
public interface DestinationsRepository extends CrudRepository<Destinations,Long> {

    List<Destinations> findByCountry(String country);
    List<Destinations> findByRegion(String region);
    List<Destinations> findByHabitat(String habitat);
    List<Destinations> findById(long id);
}
