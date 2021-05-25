package br.com.mtisi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientResource {

	@GetMapping
	public String client() {
		return "Cadastro de Cliente";
	}
}
