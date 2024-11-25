package br.com.digitalschooldiary.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalschooldiary.dto.UsuarioDTO;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@GetMapping("/1")
	@PreAuthorize("hasRole('view-applications')")
	public UsuarioDTO buscarUsuario() {
		return new UsuarioDTO(1L, "Jonatas Coelho", "jonatas.coelho@gmail.com", false);
	}

}
