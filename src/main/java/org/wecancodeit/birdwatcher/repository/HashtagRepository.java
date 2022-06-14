package org.wecancodeit.birdwatcher.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.model.Hashtag;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
}
