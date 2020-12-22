package tn.iit.examjee.service;

import org.springframework.security.core.userdetails.UserDetailsService;


import tn.iit.examjee.controller.dto.UserRegistrationDto;
import tn.iit.examjee.entities.User;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
