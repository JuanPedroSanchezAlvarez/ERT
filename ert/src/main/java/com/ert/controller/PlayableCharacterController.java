package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(path = "/characters")
@Controller
public class PlayableCharacterController {

	private static final String ACTIVE_LINK = "activeLinkCharacters";
	private static final String INDEX_URL = "characters/index";

	@GetMapping(path = {"", "/"})
	public String getIndex(Model model) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		model.addAttribute(ACTIVE_LINK, true);
		return INDEX_URL;
	}

}
