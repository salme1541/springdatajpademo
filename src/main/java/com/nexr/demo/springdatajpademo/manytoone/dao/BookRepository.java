package com.nexr.demo.springdatajpademo.manytoone.dao;

import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    //EntityGraph를 이용해서 구현할 수도 있음!
    @Query("select b from Book as b join fetch b.category")
    List<Book> findBookAndCategory();
}
