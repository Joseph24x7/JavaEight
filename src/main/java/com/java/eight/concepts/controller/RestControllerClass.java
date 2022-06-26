package com.java.eight.concepts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@GetMapping("/getSuccessResponse")
	public ResponseEntity<String> getSuccessResponse() {
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

}
