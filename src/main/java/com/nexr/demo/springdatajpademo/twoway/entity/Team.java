package com.nexr.demo.springdatajpademo.twoway.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Team implements Serializable {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "belongs")
    private Set<Member> members;

    public void add(Member member){
        member.setBelongs(this);
        this.getMembers().add(member);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Member> getMembers() {
        if(this.members == null){
            return new HashSet<>();
        } else {
            return members;
        }
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
