package com.nexr.demo.springdatajpademo.dao;

import com.nexr.demo.springdatajpademo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
