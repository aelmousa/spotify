package com.demo.spotify.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Track {

  private Long id;

  private String name;

  private Long duration;

  private String description;
}
