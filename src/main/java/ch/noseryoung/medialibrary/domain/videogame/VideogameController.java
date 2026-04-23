package ch.noseryoung.medialibrary.domain.videogame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/videogames")
public class VideogameController {

    @Autowired
    private VideogameService videogameService;

    @GetMapping
    public ResponseEntity<List<Videogame>> getAll() {
        return ResponseEntity.ok(videogameService.getAll());
    }

    @PostMapping
    public ResponseEntity<Videogame> create(@RequestBody Videogame videogame) {
        return ResponseEntity.ok(videogameService.create(videogame));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        videogameService.delete(id);
        return ResponseEntity.noContent().build();
    }
}