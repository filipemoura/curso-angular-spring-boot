package br.projeto.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.projeto.vendas.model.Cliente;
import br.projeto.vendas.repository.ClientesRepository;

@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		this.clientesRepository.persistir();
	}
	
	public void validarCliente(Cliente cliente) {
		
	}

}
