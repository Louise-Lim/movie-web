package dev.yuet.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Movie will possibly have null, so use Optional to enable null field
    Optional<Movie> findMovieByImdbId(String imdbId);
}
