package com.rgibert.ta27_ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rgibert.ta27_ex2.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}