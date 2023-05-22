package com.demo.spotify.user.service;

import com.demo.spotify.user.dto.UserCreateDto;
import com.demo.spotify.user.model.User;
import com.demo.spotify.user.repository.UserRepository;

public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User create(UserCreateDto userCreateDto) {
    User userCreate = new User();

    userCreate.setName(userCreateDto.getName());
    userCreate.setSurnames(userCreateDto.getSurnames());
    userCreate.setUsername(userCreateDto.getUsername());
    userCreate.setEmail(userCreate.getEmail());

    userRepository.save(userCreate);

    return userCreate;
  }

}
