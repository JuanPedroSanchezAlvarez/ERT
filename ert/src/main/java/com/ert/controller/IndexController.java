package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	private static final String INDEX_URL = "index";
	
	@GetMapping(path = {"", "/", "index", "index.html"})
	public String getIndex() {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return INDEX_URL;
	}

}
