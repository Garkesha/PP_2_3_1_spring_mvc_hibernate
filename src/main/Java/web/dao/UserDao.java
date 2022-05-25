package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();

    void save(User user);

    User findById(int id);

    void update(User updatedUser);

    void delete(int id);
}
