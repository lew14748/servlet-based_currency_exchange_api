package study.project.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {
    void create (T item) throws SQLException;
    void update (T item) throws SQLException;
    void delete (T item) throws SQLException;

    Optional<T> findById(int id) throws SQLException;
    List<T> findAll() throws SQLException;
}
