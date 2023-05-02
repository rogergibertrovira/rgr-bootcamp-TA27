package com.rgibert.ta27_ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta27_ex1.dao.IPiezaDAO;
import com.rgibert.ta27_ex1.dto.Pieza;

@Service
public class PiezaServiceImp implements IPiezaService {

	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		iPiezaDAO.deleteById(id);
	}
}
