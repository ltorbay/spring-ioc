package lto.example.jpa.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<User> get(final Integer login) {
        return userRepository.findById(login)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
