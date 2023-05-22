package com.demo.spotify.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDto {

  private String name;

  private String surnames;

  private String username;

  private String email;
}
