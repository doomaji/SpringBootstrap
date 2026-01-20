package springboot.security.controller;

import springboot.security.model.User;
import springboot.security.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        User user = userService.getByUsername(principal.getName());
        model.addAttribute("users", List.of(user));
        return "user/home";
    }

}