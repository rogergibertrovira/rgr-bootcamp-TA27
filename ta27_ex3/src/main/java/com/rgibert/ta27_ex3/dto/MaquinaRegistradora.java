package com.rgibert.ta27_ex3.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "piso")
	private int piso;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	// Constructores
	public MaquinaRegistradora() {

	}

	public MaquinaRegistradora(int id, int piso) {
		this.id = id;
		this.piso = piso;
	}

	// Getters
	public int getId() {
		return id;
	}

	public int getPiso() {
		return piso;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "MaquinaRegistradora [id=" + id + ", piso=" + piso + ", venta=" + venta + "]";
	}
}
