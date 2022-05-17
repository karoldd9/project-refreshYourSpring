package com.spring.SpringBoot.repositories;

import com.spring.SpringBoot.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
