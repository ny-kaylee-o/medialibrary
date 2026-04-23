package ch.noseryoung.medialibrary.domain.videogame;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}