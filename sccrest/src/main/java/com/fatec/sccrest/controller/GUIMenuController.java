package com.fatec.sccrest.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GUIMenuController {
	Logger logger = LogManager.getLogger(this.getClass());
	@GetMapping("/")
	public ModelAndView home() {
		logger.info(">>>>>> guimenucontroller chamada" );
		return new ModelAndView ("paginaMenu");
	}
}
