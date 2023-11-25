package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.security.CustomUser;
import pl.coderslab.charity.model.User;

@Service
public class CustomUserService {
    public CustomUserService(){
    }

    public static CustomUser createCustomUserFromUser(User user){
        CustomUser customUser = new CustomUser();
        customUser.setId(user.getId());
        customUser.setUsername(user.getUsername());
        customUser.setPassword(user.getPassword());
        customUser.setRole(user.getRole());
        return customUser;
    }
}
