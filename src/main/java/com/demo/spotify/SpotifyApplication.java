package com.demo.spotify;

import com.demo.spotify.playlist.model.Playlist;
import com.demo.spotify.playlist.repository.PlaylistRepository;
import com.demo.spotify.track.model.Track;
import com.demo.spotify.track.repository.TrackRepository;
import com.demo.spotify.user.model.User;
import com.demo.spotify.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotifyApplication implements CommandLineRunner {

  private final TrackRepository trackRepository;

  private final UserRepository userRepository;

  private final PlaylistRepository playlistRepository;

  public SpotifyApplication(TrackRepository trackRepository,
                            UserRepository userRepository,
                            PlaylistRepository playlistRepository) {
    this.trackRepository = trackRepository;
    this.userRepository = userRepository;
    this.playlistRepository = playlistRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpotifyApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Track track1 = new Track("Vuela con el viento", 200L, "Canción moderna");
    Track track2 = new Track("Vuela con Alfredo", 200L, "Canción moderna 2");
    Track track3 = new Track("Vuela", 200L, "Canción moderna 3");

    trackRepository.save(track1);
    trackRepository.save(track2);
    trackRepository.save(track3);

    User user1 = new User("Ayoub", "El Moussaoui", "aelmousa", "aelmousa@spotify.com");
    userRepository.save(user1);

    Playlist playlist1 = new Playlist("Course", "Descripction", true);

    playlist1.setOwner(user1);

    playlistRepository.save(playlist1);





  }
}
