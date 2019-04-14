package com.nexr.demo.springdatajpademo.twoway.dao;

import com.nexr.demo.springdatajpademo.twoway.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
