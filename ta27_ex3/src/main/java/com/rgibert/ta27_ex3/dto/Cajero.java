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
@Table(name = "cajeros")
public class Cajero {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	// Constructores
	public Cajero() {

	}

	public Cajero(int id, String nomApels) {
		this.id = id;
		this.nomApels = nomApels;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNomApels() {
		return nomApels;
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

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nomApels=" + nomApels + ", venta=" + venta + "]";
	}

}
