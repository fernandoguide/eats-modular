package br.com.caelum.eats.restaurante;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class RestauranteFormaDePagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RestauranteFormaDePagamentoId id;

	@ManyToOne
	@MapsId("restauranteId")
	private Restaurante restaurante;
	
	@Column(name = "forma_de_pagamento_id", insertable=false, updatable=false)
	private Long formaDePagamentoId;
	
	@Embeddable
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static class RestauranteFormaDePagamentoId implements Serializable {
		private static final long serialVersionUID = 1L;

		@Column(name = "restaurante_id")
		private Long restauranteId;

		@Column(name = "forma_de_pagamento_id")
		private Long formaDePagamentoId;
	}
}
