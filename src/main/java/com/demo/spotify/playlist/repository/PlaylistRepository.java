package com.demo.spotify.playlist.repository;

import com.demo.spotify.playlist.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

}
