package com.bagiswori.core.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagiswori.core.web.data.Events;

public interface IEventsDAO extends JpaRepository<Events, Long> {

	public List<Events> findByEventTagsIgnoreCaseContaining(String eventTags);

}
