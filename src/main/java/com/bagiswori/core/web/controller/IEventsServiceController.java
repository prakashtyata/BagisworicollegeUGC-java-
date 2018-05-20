package com.bagiswori.core.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bagiswori.core.web.data.Events;

/**
 * 
 * @author RajaramPakur
 *
 */
@Controller
@RequestMapping(value = "/admin/webservice/event")
public interface IEventsServiceController {

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model);

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("file") MultipartFile files, @ModelAttribute("events") Events events,
			BindingResult result, ModelMap model, final RedirectAttributes redirectAttributes);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("events") Events events, BindingResult result,
			final RedirectAttributes redirectAttributes);

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable Long id, final RedirectAttributes redirectAttributes);

}
