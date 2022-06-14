package org.wecancodeit.birdwatcher.destination;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationsRepository extends CrudRepository<Destinations,Long> {

    List<Destinations> findByCountry(String country);
    List<Destinations> findByRegion(String region);
    List<Destinations> findByHabitat(String habitat);
    List<Destinations> findById(long id);
}
