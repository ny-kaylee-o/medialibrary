package ch.noseryoung.medialibrary.domain.show;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping
    public ResponseEntity<List<Show>> getAll() {
        return ResponseEntity.ok(showService.getAll());
    }

    @PostMapping
    public ResponseEntity<Show> create(@RequestBody Show show) {
        return ResponseEntity.ok(showService.create(show));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        showService.delete(id);
        return ResponseEntity.noContent().build();
    }
}