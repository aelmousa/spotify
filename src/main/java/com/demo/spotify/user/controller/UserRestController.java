package com.demo.spotify.user.controller;

import com.demo.spotify.user.dto.UserCreateDto;
import com.demo.spotify.user.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {

  private final UserRepository userRepository;

  public UserRestController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

}
