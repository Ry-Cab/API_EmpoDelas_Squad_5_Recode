package com.empodelas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empodelas.api.model.Afiliacao;

@Repository
public interface AfiliacaoRepository extends JpaRepository<Afiliacao, Long> {

}
