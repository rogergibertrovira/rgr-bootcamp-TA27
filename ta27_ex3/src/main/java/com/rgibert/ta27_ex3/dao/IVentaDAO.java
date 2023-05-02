package com.rgibert.ta27_ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta27_ex3.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer> {

}
