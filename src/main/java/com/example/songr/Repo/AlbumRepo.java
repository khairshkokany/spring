package com.example.songr.Repo;


import com.example.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Long> {
}
