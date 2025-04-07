package com.testcourse.testcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcourse.testcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
