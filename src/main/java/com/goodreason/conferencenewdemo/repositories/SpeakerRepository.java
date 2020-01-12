package com.goodreason.conferencenewdemo.repositories;

import com.goodreason.conferencenewdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
