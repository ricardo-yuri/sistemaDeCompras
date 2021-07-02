package br.com.stefanini.sistemacompra.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.sistemacompra.dto.ClienteDto;
import br.com.stefanini.sistemacompra.model.Cliente;
import br.com.stefanini.sistemacompra.model.Endereco;

public class ClienteDao {

	private List<Cliente> clientes;

	public ClienteDao() {
		clientes = new ArrayList<Cliente>();
	}

	private Cliente dtoToClient(ClienteDto clienteDto) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(clienteDto.getIdCliente());
		cliente.setEmail(clienteDto.getEmail());
		cliente.setEndereco(new Endereco(clienteDto.getIdEndereco(), clienteDto.getLogradouro(), clienteDto.getCep(), cliente));
		return cliente;
	}

	public void adicionaCliente(ClienteDto clienteDto) {
		Cliente cliente = dtoToClient(clienteDto);
		clientes.add(cliente);
	}

}
