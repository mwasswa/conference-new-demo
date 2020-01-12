package com.goodreason.conferencenewdemo.repositories;

import com.goodreason.conferencenewdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
