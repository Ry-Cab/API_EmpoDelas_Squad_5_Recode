package com.empodelas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empodelas.api.model.Afiliada;

@Repository
public interface AfiliadaRepository extends JpaRepository<Afiliada, Long> {

}
