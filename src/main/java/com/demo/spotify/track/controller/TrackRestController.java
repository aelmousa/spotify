package com.demo.spotify.track.controller;

import com.demo.spotify.track.model.Track;
import com.demo.spotify.track.repository.TrackRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackRestController {

  private TrackRepository trackRepository;

  public TrackRestController(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }

  @GetMapping
  public List<Track> getAllTracks(){
    return trackRepository.findAll();
  }

  @PostMapping
  public Track createTrack(@RequestBody Track track){
    trackRepository.save(track);

    return track;
  }
}
