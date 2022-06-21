package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Reviews;

import java.util.List;

@Repository
public interface ReviewsRepository extends CrudRepository<Reviews, Long> {
}
