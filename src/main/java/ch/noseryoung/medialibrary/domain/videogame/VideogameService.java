package ch.noseryoung.medialibrary.domain.videogame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VideogameService {

    @Autowired
    private VideogameRepository videogameRepository;

    public List<Videogame> getAll() {
        return videogameRepository.findAll();
    }

    public Videogame create(Videogame videogame) {
        return videogameRepository.save(videogame);
    }

    public void delete(Long id) {
        videogameRepository.deleteById(id);
    }
}