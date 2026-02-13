package com.dwes.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/robert")
public class NewRoute {

	private static final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);

	@GetMapping
	public ResponseEntity<String> saludoNew() {
		logger.info("## AuthorizationController :: sayHola");
		return ResponseEntity.ok("Bienvenido a la nueva ruta ;)");
	}
}
