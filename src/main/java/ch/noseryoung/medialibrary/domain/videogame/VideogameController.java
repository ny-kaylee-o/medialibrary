package ch.noseryoung.medialibrary.domain.videogames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videogames")
public class VideogameController {

    @Autowired
    private VideogameService videogameService;

}
