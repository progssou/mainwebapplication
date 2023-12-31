package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.User;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username); // User findByUsername
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    List<User> findByAddress(String address);
    List<User> findByStateUser(boolean stateUser);
}

