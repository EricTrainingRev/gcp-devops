package org.example.dao;

import java.util.Optional;

import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    
    Optional<User> findByUsernameAndPassword(String username, String password);
    
}
