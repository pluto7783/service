package com.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@RequestMapping("/main")
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("msg", "메인");
		
		return "main";
	}
	
	@RequestMapping(value = "/tetris", method = RequestMethod.GET)
	public String tetris(Model model) {
		logger.info("##### tetirs");
		
		model.addAttribute("msg", "테트리스");
		
		return "/tetris/tetris";
	}
	
}
