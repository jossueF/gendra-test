package com.gendratest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gendratest.models.ZipCodeData;
import com.gendratest.services.FindZipService;

@RestController
@RequestMapping("/zip-codes")
public class ZipController {
	
	@Autowired
	private FindZipService service;

	@RequestMapping(value = "/{zip-code}", method = RequestMethod.GET)
	public ResponseEntity<ZipCodeData> findAllZips(@PathVariable("zip-code") String zip) {
		return new ResponseEntity<ZipCodeData>(service.getZipData(zip).get(0), HttpStatus.OK);
	}

}
