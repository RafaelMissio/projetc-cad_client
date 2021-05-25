package br.com.mtisi.resources;

import br.com.mtisi.DTO.ClientDTO;
import br.com.mtisi.entities.Client;
import br.com.mtisi.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientResource {

	@Autowired
	private ClientServices service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll(){
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
		ClientDTO client = service.findById(id);
		return ResponseEntity.ok().body(client);
	}

	@PostMapping
	public ResponseEntity<ClientDTO> insert(ClientDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClientDTO>update(@PathVariable Long id, @RequestBody ClientDTO dto){
		dto = service.update(id,dto);
		return ResponseEntity.ok().body(dto);
	}
}

