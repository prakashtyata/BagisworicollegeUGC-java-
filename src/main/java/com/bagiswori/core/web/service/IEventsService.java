package com.bagiswori.core.web.service;

import java.util.List;

import com.bagiswori.core.web.data.Events;

public interface IEventsService {

	public Events createEvents(Events event);

	public Events deleteById(Long eventId);

	public List<Events> findAll();

	public Events update(Events event);

	public Events findById(Long eventId);

	public List<Events> findByTags(String eventTags);

}
