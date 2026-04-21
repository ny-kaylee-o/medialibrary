package ch.noseryoung.medialibrary.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User found = userService.findByUsername(user.getUsername(), user.getPassword());
        if (found != null) {
            return ResponseEntity.ok(found.getRole());
        } else {
            return ResponseEntity.status(401).body("invalid");
        }
    }
}