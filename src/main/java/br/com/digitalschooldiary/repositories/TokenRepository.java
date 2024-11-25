package br.com.digitalschooldiary.repositories;

import br.com.digitalschooldiary.vos.UserAuthVO;

public interface TokenRepository {
	
	String getToken(UserAuthVO token);

}
