package br.com.caelum.eats.restaurante;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface RestauranteFormaDePagamentoRepository extends JpaRepository<RestauranteFormaDePagamento, RestauranteFormaDePagamento.RestauranteFormaDePagamentoId> {

	@Query("select rf.formaDePagamentoId from RestauranteFormaDePagamento rf join rf.restaurante r where r = :restaurante")
	List<Long> findAllByRestauranteOrderByNomeAsc(@Param("restaurante") Restaurante restaurante);

}
