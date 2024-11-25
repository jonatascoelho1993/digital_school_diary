package br.com.digitalschooldiary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalschooldiary.dto.UserAuthDTO;
import br.com.digitalschooldiary.repositories.TokenRepository;
import br.com.digitalschooldiary.vos.UserAuthVO;

@Service
public class TokenService {

	@Autowired
	private TokenRepository repository;

	public String getToken(UserAuthDTO user) {
		UserAuthVO vo = UserAuthVO.builder() //
				.username(user.getUsername()) //
				.password(user.getPassword()) //
				.build();

		return repository.getToken(vo);
	}

}
