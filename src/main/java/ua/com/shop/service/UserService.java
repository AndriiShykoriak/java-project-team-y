package ua.com.shop.service;

import ua.com.shop.model.User;

public interface UserService {
    void save(User user);
    User findByName(String username);
}
