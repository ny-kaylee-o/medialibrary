package ch.noseryoung.medialibrary.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        boolean success = userService.login(user.getUsername(), user.getPassword());
        if (success) {
            return ResponseEntity.ok("login successful");
        } else {
            return ResponseEntity.status(401).body("login invalid");
        }
    }
}