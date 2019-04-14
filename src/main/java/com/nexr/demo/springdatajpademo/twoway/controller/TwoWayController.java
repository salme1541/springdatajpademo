package com.nexr.demo.springdatajpademo.twoway.controller;

import com.nexr.demo.springdatajpademo.twoway.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TwoWayController {

    @GetMapping("/members")
    public List<Member> getMembers(){
        return null;
    }
}
