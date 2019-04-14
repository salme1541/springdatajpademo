package com.nexr.demo.springdatajpademo.manytoone.dao;

import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
