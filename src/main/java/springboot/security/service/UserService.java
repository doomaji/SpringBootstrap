package springboot.security.service;

import springboot.security.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}