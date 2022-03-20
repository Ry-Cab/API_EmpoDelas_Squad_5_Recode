package com.empodelas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empodelas.api.model.Autonoma;

@Repository
public interface AutonomaRepository extends JpaRepository<Autonoma, Long> {

}
