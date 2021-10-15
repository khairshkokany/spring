package com.example.songr.Repo;

import com.example.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepo extends JpaRepository<Song , Long> {
Song findByAlbumId(Long album_id);

}
