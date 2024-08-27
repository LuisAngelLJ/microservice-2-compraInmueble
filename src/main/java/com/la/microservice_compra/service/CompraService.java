package com.la.microservice_compra.service;

import com.la.microservice_compra.model.Compra;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
