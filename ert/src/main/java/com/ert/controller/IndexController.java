package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@GetMapping(path = {"", "/", "index", "index.html"})
	public String getIndex() {
		log.debug("LOG: " + this.getClass().getName() + " --> getIndex");
		return "index";
	}
	
}
