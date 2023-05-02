package com.rgibert.ta27_ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta27_ex2.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
