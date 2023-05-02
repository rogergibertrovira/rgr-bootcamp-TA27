package com.rgibert.ta27_ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta27_ex1.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String> {

}
