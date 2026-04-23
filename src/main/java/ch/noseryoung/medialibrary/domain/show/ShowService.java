package ch.noseryoung.medialibrary.domain.show;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public List<Show> getAll() {
        return showRepository.findAll();
    }

    public Show create(Show show) {
        return showRepository.save(show);
    }

    public void delete(Long id) {
        showRepository.deleteById(id);
    }
}