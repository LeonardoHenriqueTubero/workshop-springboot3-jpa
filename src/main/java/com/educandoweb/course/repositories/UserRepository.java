package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitties.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
