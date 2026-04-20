package ch.noseryoung.medialibrary.domain.show;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/shows")
@RestController
public class ShowController {

    @GetMapping("/hello")
    public String hello() {
        return "haiiii!!!!!!!!!";
    }
}



