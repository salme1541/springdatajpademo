package com.nexr.demo.springdatajpademo.twoway.dao;

import com.nexr.demo.springdatajpademo.twoway.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
