package com.l0tu2.organisation.chart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	 @RequestMapping(value = "/import", method = RequestMethod.GET)
	 public void importFromLDAP() {
		 
	 }
}
