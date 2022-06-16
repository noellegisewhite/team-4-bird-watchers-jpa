package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Reviews;

import java.util.List;

public interface ReviewsRepository extends CrudRepository<Reviews, Long>{
    List<Reviews> findById(long id);
    List<Reviews> findByName(String name);
    List<Reviews> findByRating(int rating);
    List<Reviews> findByTouristLocation(String touristLocation);
}
