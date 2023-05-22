package com.demo.spotify.user.service;

import com.demo.spotify.user.dto.UserCreateDto;
import com.demo.spotify.user.model.User;

public interface UserService {

  User create(UserCreateDto userCreateDto);

}
