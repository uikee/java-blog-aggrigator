package com.upuna.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upuna.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
