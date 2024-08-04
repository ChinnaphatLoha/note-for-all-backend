package com.sit.note_app.repositories;

import com.sit.note_app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Short> {

  Optional<User> findByUsername(String username);

}