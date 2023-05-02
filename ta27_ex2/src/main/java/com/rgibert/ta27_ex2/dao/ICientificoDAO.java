package com.rgibert.ta27_ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta27_ex2.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, String> {

}
