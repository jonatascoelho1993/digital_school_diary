package br.com.digitalschooldiary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
	
	private Long idUsuario;
	private String nome;
	private String email;
	private boolean isResponsavel;

}
