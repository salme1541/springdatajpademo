package com.nexr.demo.springdatajpademo.dao;

import com.nexr.demo.springdatajpademo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
