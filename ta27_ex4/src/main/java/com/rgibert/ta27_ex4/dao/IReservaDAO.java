package com.rgibert.ta27_ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta27_ex4.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer> {

}
