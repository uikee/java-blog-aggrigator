package com.upuna.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upuna.jba.entity.Blog;
import com.upuna.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);

}
