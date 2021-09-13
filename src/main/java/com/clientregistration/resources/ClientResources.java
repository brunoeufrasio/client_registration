package com.clientregistration.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientregistration.entities.Client;
import com.clientregistration.repositories.ClientRepository;

@RestController
@RequestMapping(value="/client")
public class ClientResources {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public ResponseEntity<List<Client>> getAllClient() {
		List<Client> list = clientRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable Long id) {
		Client client = clientRepository.getById(id);
		return ResponseEntity.ok(client);		
	}

}
