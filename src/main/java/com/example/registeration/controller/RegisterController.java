package com.example.registeration.controller;

import com.example.registeration.model.User;
import com.example.registeration.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;


@Controller
public class RegisterController {

    private final UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping("/register")
    public String process(@Valid @ModelAttribute("user") User user, BindingResult result){
        if(result.hasErrors()){
            return "register";
        }
        Optional<User> existingUser=userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()){
            result.rejectValue("email",null,"user is already present");
            return "register";
        }
        userRepository.save(user);
        return "redirect:/success";
    }
    @GetMapping("/success")
    public String showSuccess() {
        return "success"; // Create a simple success.html file later
    }

}
