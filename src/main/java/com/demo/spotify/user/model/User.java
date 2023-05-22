package com.demo.spotify.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private String surnames;

  @Column(unique = true, length = 20, nullable = false)
  private String username;

  @Column(unique = true, length = 100, nullable = false)
  @Email(message = "Email no válido")
  private String email;

  private LocalDateTime registerDate = LocalDateTime.now();

  public User(String name, String surnames, String username, String email) {
    this.name = name;
    this.surnames = surnames;
    this.username = username;
    this.email = email;
  }
}
