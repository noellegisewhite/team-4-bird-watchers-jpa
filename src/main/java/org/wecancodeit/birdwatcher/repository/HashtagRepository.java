package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.model.Hashtag;

@Repository
public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
}
