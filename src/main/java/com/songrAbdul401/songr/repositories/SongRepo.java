package com.songrAbdul401.songr.repositories;

import com.songrAbdul401.songr.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song,Long> {

}
