package com.example.registeration.controller;

import com.example.registeration.model.User;
import com.example.registeration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class LoginController {
    private final UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/login")
    public String showLoginForm(Model model){
        model.addAttribute("user",new User());
        return "login";
    }

    // LoginController.java
    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user, Model model) {
        Optional<User> loginUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (loginUser.isPresent()) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard"; // This will render dashboard.html from templates folder
    }

}
