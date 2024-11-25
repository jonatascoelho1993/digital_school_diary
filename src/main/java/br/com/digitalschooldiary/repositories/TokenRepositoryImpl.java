package br.com.digitalschooldiary.repositories;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import br.com.digitalschooldiary.vos.UserAuthVO;

@Component
public class TokenRepositoryImpl implements TokenRepository {

	@Override
	public String getToken(UserAuthVO user) {
		HttpHeaders headers = new HttpHeaders();
		RestTemplate rt = new RestTemplate();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
		formData.add("client_id", "app_dsd");
		formData.add("username", user.getUsername());
		formData.add("password", user.getPassword());
		formData.add("grant_type", "password");

		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(formData,
				headers);

		ResponseEntity<String> result = rt.postForEntity("http://localhost:8080/realms/dsd/protocol/openid-connect/token", entity,
				String.class);
		
		return result.getBody();
	}

}
