package tr.com.t2.ik.ws;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@PreAuthorize("hasRole('ROLE_USER')")
public class UserController {

    @GetMapping
    public String getMethod() {
        return "User Area, Welcome";
    }

}
