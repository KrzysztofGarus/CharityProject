package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.dto.UserRegistrationDTO;
import pl.coderslab.charity.service.UserService;

import javax.validation.Valid;

@Controller
public class RegisterController {

    private final UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public String processRegistration(@ModelAttribute("userDto") @Valid UserRegistrationDTO userDto, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        userService.registerNewUser(userDto);
        return "redirect:/login";
    }
}
