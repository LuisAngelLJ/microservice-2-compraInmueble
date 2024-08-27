package com.la.microservice_compra.controller;

import com.la.microservice_compra.model.Compra;
import com.la.microservice_compra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/compra")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Compra compra) {
        return new ResponseEntity<>(this.compraService.saveCompra(compra), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getAllComprasOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(this.compraService.findAllComprasOfUser(userId));
    }
}
