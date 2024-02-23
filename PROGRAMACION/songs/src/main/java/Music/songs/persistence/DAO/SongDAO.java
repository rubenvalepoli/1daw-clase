package Music.songs.persistence.DAO;

import Music.songs.persistence.DAO.entity.SongEntity;

import java.util.List;

public interface SongDAO {
    public List<SongEntity> getAll();
    public SongEntity findById(Integer id);
}
