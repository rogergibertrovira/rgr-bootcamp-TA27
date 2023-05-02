package com.rgibert.ta27_ex4.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "investigador_id")
	private Investigador investigador;

	@ManyToOne
	@JoinColumn(name = "equipo_id")
	private Equipo equipo;

	// Constructores
	public Reserva() {

	}

	public Reserva(int id, Investigador investigador, Equipo equipo) {
		this.id = id;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	// Getters
	public int getId() {
		return id;
	}

	public Investigador getInvestigador() {
		return investigador;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", investigador=" + investigador + ", equipo=" + equipo + "]";
	}

}
