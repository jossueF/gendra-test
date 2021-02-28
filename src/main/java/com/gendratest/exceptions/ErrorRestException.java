package com.gendratest.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gendratest.models.CustomErrorJson;

@ControllerAdvice(value = {"com.gendratest.controllers"})
public class ErrorRestException {

	@ExceptionHandler
	public ResponseEntity<CustomErrorJson> handleException(Exception ex, HttpServletRequest request) { 
	    return new ResponseEntity<CustomErrorJson>(new CustomErrorJson(
	    		HttpStatus.NOT_FOUND.value(), 
	    		"No se puede localizar el zip solicitado", 
	    		"Intente con otro código postal", 
	    		request.getRequestURI(), 
	    		"N/A"), 
	    		HttpStatus.NOT_FOUND);
	}
	
}
