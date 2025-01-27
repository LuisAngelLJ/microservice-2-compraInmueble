package com.la.microservice_compra.service;

import com.la.microservice_compra.model.Compra;
import com.la.microservice_compra.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compra saveCompra(Compra compra) {
        compra.setFechaCompra(LocalDateTime.now());
        return this.compraRepository.save(compra);
    }

    @Override
    public List<Compra> findAllComprasOfUser(Long userId) {
        return this.compraRepository.findAllByUserId(userId);
    }
}
