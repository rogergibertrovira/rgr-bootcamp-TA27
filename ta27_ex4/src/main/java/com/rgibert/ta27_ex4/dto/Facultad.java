package com.rgibert.ta27_ex4.dto;

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
@Table(name = "facultades")
public class Facultad {

	// Atributos
	@Id
	private String id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Equipo> equipo;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Investigador> investigador;

	// Constructores
	public Facultad() {

	}

	public Facultad(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}

	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", equipo=" + equipo + ", investigador=" + investigador
				+ "]";
	}
	
}
