package com.songrAbdul401.songr.repositories;
import com.songrAbdul401.songr.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepo extends JpaRepository<Album, Long>{
    public Album findByTitle(String title);
}
