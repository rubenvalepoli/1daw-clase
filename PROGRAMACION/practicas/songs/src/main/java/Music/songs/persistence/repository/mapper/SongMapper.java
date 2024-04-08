package Music.songs.persistence.repository.mapper;

import Music.songs.domain.entity.Song;
import Music.songs.persistence.DAO.entity.SongEntity;

import java.util.ArrayList;
import java.util.List;

public class SongMapper {

    public static Song toSong(SongEntity songEntity){
        if (songEntity == null){
            return null;
        }
        return new Song(
                songEntity.getId(),
                songEntity.getTitle(),
                songEntity.getYear()
        );
    }

    public static List<Song> toSongList(List<SongEntity> songEntityList){
        List<Song> songList = new ArrayList<>();
        for (SongEntity songEntity : songEntityList){
            songList.add(toSong(songEntity));
        }
        return songList;
    }
}
