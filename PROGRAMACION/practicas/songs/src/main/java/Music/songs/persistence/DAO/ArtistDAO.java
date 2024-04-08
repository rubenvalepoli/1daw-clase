package Music.songs.persistence.DAO;

import Music.songs.persistence.DAO.entity.ArtistEntity;

import java.util.List;

public interface ArtistDAO {
    public List<ArtistEntity> getAll();

    public ArtistEntity findById(int id);
}
