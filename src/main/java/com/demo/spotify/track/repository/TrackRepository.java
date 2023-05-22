package com.demo.spotify.track.repository;

import com.demo.spotify.track.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Long> {

}
