package com.project.MusicStore.repository;


import com.project.MusicStore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
