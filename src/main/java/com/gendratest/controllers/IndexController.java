package com.gendratest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/procesarFormulario", method = RequestMethod.GET)
	public String procesarFormulario(@RequestParam String zip) {
		return String.format("redirect:/zip-codes/%s", zip);
	}
	
}
