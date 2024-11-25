package br.com.digitalschooldiary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalschooldiary.dto.UserAuthDTO;
import br.com.digitalschooldiary.services.TokenService;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	private TokenService service;

	@PostMapping("/")
	public ResponseEntity<String> token(@RequestBody UserAuthDTO user) {
		String token = service.getToken(user);
		return new ResponseEntity<String>(token, HttpStatus.OK);
	}
	
}