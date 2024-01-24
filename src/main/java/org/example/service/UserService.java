package org.example.service;

import java.util.Optional;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean findByUsernameAndPassword(String username, String password) {
        Optional<User> possibleUser = userDao.findByUsernameAndPassword(username, password);
        return possibleUser.isPresent();
    }
}
