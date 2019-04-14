package com.nexr.demo.springdatajpademo.twoway.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Member implements Serializable {
    @Id @GeneratedValue
    private Long id;

    private String firstName;

    @ManyToOne()
    private Team belongs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Team getBelongs() {
        return belongs;
    }

    public void setBelongs(Team belongs) {
        this.belongs = belongs;
    }
}
