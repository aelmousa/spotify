package com.demo.spotify.controller;

import com.demo.spotify.model.Track;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TrackRestController {

  private List<Track> tracks;

  public TrackRestController() {
    tracks = new ArrayList<>();
    Track track1 = new Track(1L, "Vuela con el viento", 200L, "Canción moderna");
    Track track2 = new Track(2L, "Vuela con Alfredo", 200L, "Canción moderna");
    Track track3 = new Track(3L, "Vuela", 200L, "Canción moderna");
    tracks.add(track1);
    tracks.add(track2);
    tracks.add(track3);
  }

  @GetMapping("/tracks")
  public List<Track> getAllTracks(){
    return tracks;
  }
}
