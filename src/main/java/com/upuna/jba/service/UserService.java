package com.upuna.jba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upuna.jba.entity.Blog;
import com.upuna.jba.entity.Item;
import com.upuna.jba.entity.User;
import com.upuna.jba.repository.BlogRepository;
import com.upuna.jba.repository.ItemRepository;
import com.upuna.jba.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findUser(int id) {
		return userRepository.findOne(id);
	}

	@Transactional
	public User findUserWithBlogs(int id) {
		User user = findUser(id);
		List<Blog> blogs = blogRepository.findByUser(user);
		for (Blog blog : blogs) {
			List<Item> items = itemRepository.findByBlog(blog);
			blog.setItems(items);
		}
		user.setBlogs(blogs);
		return user;
	}

}
