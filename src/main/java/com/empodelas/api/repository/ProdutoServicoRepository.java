package com.empodelas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empodelas.api.model.ProdutoServico;

@Repository
public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Long> {

}
