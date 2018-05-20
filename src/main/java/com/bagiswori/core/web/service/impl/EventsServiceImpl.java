package com.bagiswori.core.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bagiswori.core.web.dao.IEventsDAO;
import com.bagiswori.core.web.data.Events;
import com.bagiswori.core.web.service.IEventsService;

/**
 * 
 * @author RajaramPakur
 *
 */
@Service
@Transactional
public class EventsServiceImpl implements IEventsService {

	@Autowired
	private IEventsDAO eventsDAO;

	@Override
	public Events createEvents(Events event) {
		eventsDAO.save(event);
		return event;
	}

	@Override
	public Events deleteById(Long eventId) {
		Events events = findById(eventId);
		if (events != null) {
			eventsDAO.delete(eventId);
		}
		return events;
	}

	@Override
	public List<Events> findAll() {
		return eventsDAO.findAll();
	}

	@Override
	public Events update(Events event) {
		if (findById(event.getId()) != null) {
			eventsDAO.save(event);
		}
		return event;
	}

	@Override
	public Events findById(Long eventId) {
		return eventsDAO.findOne(eventId);
	}

	@Override
	public List<Events> findByTags(String eventTags) {
		return eventsDAO.findByEventTagsIgnoreCaseContaining(eventTags);
	}

}
