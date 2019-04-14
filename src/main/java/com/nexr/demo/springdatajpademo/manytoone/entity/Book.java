package com.nexr.demo.springdatajpademo.manytoone.entity;

import javax.persistence.*;

@Entity
public class Book {

    //단 방향 Book -> Category
    public Book(){
    }

    @Id @GeneratedValue
    private Long id;

    private String title;


    //Category 정보는 빼고 싶을 때 (fetch = FetchType.LAZY) 그냥 쓰면 ByteBuddyInterceptor Exception 발생하니 Dto 로 변환해줘야함
    // Res 객체로 converting
    @ManyToOne()
    @JoinColumn(name = "category_id")
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
