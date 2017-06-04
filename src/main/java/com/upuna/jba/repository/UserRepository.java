package com.upuna.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upuna.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
