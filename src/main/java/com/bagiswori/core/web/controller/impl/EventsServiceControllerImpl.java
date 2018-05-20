package com.bagiswori.core.web.controller.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bagiswori.core.web.controller.IEventsServiceController;
import com.bagiswori.core.web.data.Events;
import com.bagiswori.core.web.service.IEventsService;

/**
 * 
 * @author RajaramPakur
 *
 */
@Service
public class EventsServiceControllerImpl implements IEventsServiceController {

	private final Logger logger = LoggerFactory.getLogger(EventsServiceControllerImpl.class);

	@Autowired
	private IEventsService eventsService;

	@Autowired
	private Environment environment;

	@Override
	public String showForm(ModelMap model) {
		logger.debug("Events showForm()");
		List<Events> eventsList = eventsService.findAll();
		model.addAttribute("events", eventsList);
		model.addAttribute("event", new Events());
		return "eventReg";
	}

	@Override
	public ModelAndView add(MultipartFile file, Events events, BindingResult result, ModelMap model,
			RedirectAttributes redirectAttributes) {
		String filePath = null;
		ModelAndView mv = null;
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				filePath = new StringBuilder(environment.getProperty("fileupload.dir")).append("/events/")
						.append(file.getOriginalFilename()).toString();
				Path path = Paths.get(filePath);
				Files.write(path, bytes);
			} catch (Exception e) {
				redirectAttributes.addFlashAttribute("message",
						new StringBuilder().append("File doesnot support").toString());

			}
		}
		if (result.hasErrors()) {
			return new ModelAndView("errorPage");
		}
		if (!result.hasErrors()) {
			events.setEventImg(filePath);
			mv = new ModelAndView("eventReg");
			eventsService.createEvents(events);
			events = new Events();
			mv.addObject("event", events);
		}
		redirectAttributes.addFlashAttribute("message",
				new StringBuilder().append("Event was successfully added.").toString());
		List<Events> eventsList = eventsService.findAll();
		Collections.sort(eventsList);
		Collections.sort(eventsList, Collections.reverseOrder());
		mv.addObject("events", eventsList);
		return mv;
	}

	@Override
	public ModelAndView update(Events events, BindingResult result, RedirectAttributes redirectAttributes) {
		ModelAndView mv = new ModelAndView("eventReg");
		if (!result.hasErrors()) {
			eventsService.update(events);
			events = new Events();
			mv.addObject("event", events);
		}
		mv.addObject("events", eventsService.findAll());
		redirectAttributes.addFlashAttribute("message",
				new StringBuilder().append("Event was successfully updated.").toString());
		return mv;
	}

	@Override
	public ModelAndView delete(Long id, RedirectAttributes redirectAttributes) {
		ModelAndView mv = new ModelAndView("eventReg");
		eventsService.deleteById(id);
		mv.addObject("events", eventsService.findAll());
		mv.addObject("event", new Events());
		String message = new StringBuilder().append("Event ").append(id).append(" was successfully deleted.")
				.toString();
		redirectAttributes.addFlashAttribute("message", message);
		return mv;
	}

}
