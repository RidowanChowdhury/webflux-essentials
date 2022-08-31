package webfluxessentials.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import webfluxessentials.domain.Anime;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}
