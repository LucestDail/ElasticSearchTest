package com.es.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/person")
public class PersonController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView basicMethod(Model model) {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
}
