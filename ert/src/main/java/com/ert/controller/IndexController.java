package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@RequestMapping(path = {"", "/", "index", "index.html"})
	public String getIndex() {
		log.debug("LOG: " + this.getClass().getName() + " --> getIndex");
		return "index";
	}
	
}
