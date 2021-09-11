package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ert.service.ISpellService;
import com.ert.util.LoggingUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(path = "/spells")
@Controller
public class SpellController {

	private static final String ACTIVE_LINK = "activeLinkSpells";
	private static final String INDEX_URL = "spells/index";
	
	private final ISpellService service;
	
	public SpellController(ISpellService service) {
		this.service = service;
	}

	@GetMapping(path = {"", "/"})
	public String getIndex(Model model) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		model.addAttribute(ACTIVE_LINK, true);
		model.addAttribute("listOfSpells", service.findAll());
		return INDEX_URL;
	}

}
