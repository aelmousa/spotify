package com.demo.spotify.controller;

import com.demo.spotify.model.Track;
import com.demo.spotify.repository.TrackRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackRestController {

  private TrackRepository trackRepository;

  public TrackRestController(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;

    Track track1 = new Track("Vuela con el viento", 200L, "Canción moderna");
    Track track2 = new Track("Vuela con Alfredo", 200L, "Canción moderna 2");
    Track track3 = new Track("Vuela", 200L, "Canción moderna 3");

    trackRepository.save(track1);
    trackRepository.save(track2);
    trackRepository.save(track3);

  }

  @GetMapping("/tracks")
  public List<Track> getAllTracks(){
    return null;
  }

  @PostMapping("/tracks")
  public void createTrack(@RequestBody Track track){
    //tracks.add(track);
  }
}
