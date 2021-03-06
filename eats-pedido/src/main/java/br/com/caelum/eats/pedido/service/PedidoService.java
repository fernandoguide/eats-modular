package br.com.caelum.eats.pedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caelum.eats.pedido.entidade.Pedido;
import br.com.caelum.eats.pedido.entidade.Pedido.Status;
import br.com.caelum.eats.pedido.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido porIdComItens(Long pedidoId) {
		return repo.porIdComItens(pedidoId);
	}

	public void atualizaStatus(Status status, Pedido pedido) {
		repo.atualizaStatus(status, pedido);
	}

}
