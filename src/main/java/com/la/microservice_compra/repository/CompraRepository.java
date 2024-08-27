package com.la.microservice_compra.repository;

import com.la.microservice_compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    //compras realizadas por determinado usuario
    List<Compra> findAllByUserId(Long userId);
}
