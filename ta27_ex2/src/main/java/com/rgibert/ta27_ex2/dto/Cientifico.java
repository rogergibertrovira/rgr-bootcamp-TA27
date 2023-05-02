package com.rgibert.ta27_ex2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientifico {

	// Atributos
	@Id
	private String id;
	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany
	@JoinColumn(name = "id")
	private List<AsignadoA> asignadoA;

	// Constructores
	public Cientifico() {

	}

	public Cientifico(String id, String nomApels) {
		this.id = id;
		this.nomApels = nomApels;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNomApels() {
		return nomApels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", nomApels=" + nomApels + ", asignadoA=" + asignadoA + "]";
	}
}
