package com.nexr.demo.springdatajpademo.entity;

import javax.persistence.*;

@Entity
public class Book {

    public Book(){

    }

    @Id @GeneratedValue
    private Long id;

    private String title;


    //Category 정보는 빼고 싶을 때 (fetch = FetchType.LAZY) ByteBuddyInterceptor Exception
    // Res 객체로 converting
    @ManyToOne()
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
