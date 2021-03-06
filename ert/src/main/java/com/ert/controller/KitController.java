package com.ert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ert.service.IKitService;
import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(path = "/kits")
@Controller
public class KitController {

	private static final String ACTIVE_LINK = "activeLinkKits";
	private static final String INDEX_URL = "kits/index";

	private final IKitService service;

	public KitController(IKitService service) {
		this.service = service;
	}

	@GetMapping(path = {"", "/"})
	public String getIndex(Model model) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		model.addAttribute(ACTIVE_LINK, true);
		model.addAttribute("listOfKits", service.findAll());
		return INDEX_URL;
	}

}
