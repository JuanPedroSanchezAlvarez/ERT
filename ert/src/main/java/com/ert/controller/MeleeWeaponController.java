package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ert.service.IMeleeWeaponService;
import com.ert.util.LoggingUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(path = "/melee-weapons")
@Controller
public class MeleeWeaponController {

	private static final String ACTIVE_LINK = "activeLinkMeleeWeapons";
	private static final String INDEX_URL = "melee-weapons/index";
	
	private final IMeleeWeaponService service;
	
	public MeleeWeaponController(IMeleeWeaponService service) {
		this.service = service;
	}

	@GetMapping(path = {"", "/"})
	public String getIndex(Model model) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		model.addAttribute(ACTIVE_LINK, true);
		model.addAttribute("listOfMeleeWeapons", service.findAll());
		return INDEX_URL;
	}

}
