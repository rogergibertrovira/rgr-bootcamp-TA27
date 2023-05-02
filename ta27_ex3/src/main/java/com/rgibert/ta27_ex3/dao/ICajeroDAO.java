package com.rgibert.ta27_ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta27_ex3.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Integer> {

}
