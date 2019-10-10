package com.chanpion.boot.neo4j.dao;

import com.chanpion.boot.neo4j.entity.Actor;
import com.chanpion.boot.neo4j.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author April Chen
 * @date 2019/10/8 10:27
 */
@Repository
public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    Optional<Movie> findOneByName(String name);

    // returns the node with id equal to idOfMovie parameter
    @Query("MATCH (n) WHERE id(n)={0} RETURN n")
    Movie getMovieFromId(Integer idOfMovie);

    // returns the nodes which have a title according to the movieTitle parameter
//    @Query("MATCH (movie:Movie {title={0}}) RETURN movie")
//    Movie getMovieFromTitle(String movieTitle);

    // same with optional result
    @Query("MATCH (movie:Movie {title={0}}) RETURN movie")
    Optional<Movie> getMovieFromTitle(String movieTitle);

    // returns a Page of Actors that have a ACTS_IN relationship to the movie node with the title equal to movieTitle parameter.
    @Query(value = "MATCH (movie:Movie {title={0}})<-[:ACTS_IN]-(actor) RETURN actor", countQuery = "MATCH (movie:Movie {title={0}})<-[:ACTS_IN]-(actor) RETURN count(actor)")
    Page<Actor> getActorsThatActInMovieFromTitle(String movieTitle, PageRequest page);

    // returns a Page of Actors that have a ACTS_IN relationship to the movie node with the title equal to movieTitle parameter with an accurate total count
    @Query(value = "MATCH (movie:Movie {title={0}})<-[:ACTS_IN]-(actor) RETURN actor", countQuery = "MATCH (movie:Movie {title={0}})<-[:ACTS_IN]-(actor) RETURN count(*)")
    Page<Actor> getActorsThatActInMovieFromTitle(String movieTitle, Pageable page);

    // returns a Slice of Actors that have a ACTS_IN relationship to the movie node with the title equal to movieTitle parameter.
//    @Query("MATCH (movie:Movie {title={0}})<-[:ACTS_IN]-(actor) RETURN actor")
//    Slice<Actor> getActorsThatActInMovieFromTitle(String movieTitle, Pageable page);

    // returns users who rated a movie (movie parameter) higher than rating (rating parameter)
//    @Query("MATCH (movie:Movie)<-[r:RATED]-(user) " +
//            "WHERE id(movie)={movieId} AND r.stars > {rating} " +
//            "RETURN user")
//    Iterable<User> getUsersWhoRatedMovieFromTitle(@Param("movieId") Movie movie, @Param("rating") Integer rating);
//
//    // returns users who rated a movie based on movie title (movieTitle parameter) higher than rating (rating parameter)
//    @Query("MATCH (movie:Movie {title:{0}})<-[r:RATED]-(user) " +
//            "WHERE r.stars > {1} " +
//            "RETURN user")
//    Iterable<User> getUsersWhoRatedMovieFromTitle(String movieTitle, Integer rating);

    @Query(value = "MATCH (movie:Movie) RETURN movie;")
    Stream<Movie> getAllMovies();
}
