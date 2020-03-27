package com.nexr.demo.springdatajpademo.manytoone.service.impl;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ManyToOneServiceImplTest {

    @InjectMocks
    private BookServiceImpl bookService;

    @Mock
    private BookRepository mockBookRepository;


}