package com.nexr.demo.springdatajpademo.manytoone.dao;

import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
