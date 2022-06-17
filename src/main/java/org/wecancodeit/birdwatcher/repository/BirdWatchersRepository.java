package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.BirdWatchers;
import java.util.List;

@Repository
public interface BirdWatchersRepository extends CrudRepository<BirdWatchers, Long> {

    List<BirdWatchers> findByTypeOfBirdWatcher(String typeOfBirdWatcher);
    List<BirdWatchers> findById(long id);
}
