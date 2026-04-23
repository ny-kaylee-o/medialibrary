package ch.noseryoung.medialibrary.domain.videogames;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}