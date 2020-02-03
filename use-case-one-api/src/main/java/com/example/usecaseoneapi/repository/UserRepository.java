package com.example.usecaseoneapi.repository;

import com.example.usecaseoneapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository annotation. This tells Spring to bootstrap the repository during component scan.
@Repository
//Generics are the Model and the type of its primary key
public interface UserRepository extends JpaRepository<User, Long> {

  // @TODO Add method to retrieve user(s) without password attribute

}
